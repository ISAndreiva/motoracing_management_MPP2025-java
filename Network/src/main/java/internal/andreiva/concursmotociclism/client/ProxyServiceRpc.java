package internal.andreiva.concursmotociclism.client;

import internal.andreiva.concursmotociclism.*;
import internal.andreiva.concursmotociclism.domain.Race;
import internal.andreiva.concursmotociclism.domain.Racer;
import internal.andreiva.concursmotociclism.domain.Team;
import internal.andreiva.concursmotociclism.service.ObservableServiceInterface;
import internal.andreiva.concursmotociclism.utils.EventType;
import internal.andreiva.concursmotociclism.utils.Observer;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.*;

public class ProxyServiceRpc implements ObservableServiceInterface
{
    protected final static Logger logger = LogManager.getLogger();
    private final List<Observer> observers = new ArrayList<>();
    private final ManagedChannel channel;
    private final ProxyServiceGrpc.ProxyServiceBlockingStub blockingStub;
    private final ProxyServiceGrpc.ProxyServiceStub observerStub;

    public ProxyServiceRpc(String host, int port)
    {
        this(ManagedChannelBuilder.forAddress(host, port).usePlaintext());
    }

    public ProxyServiceRpc()
    {
        this("localhost", 9898);
    }

    public ProxyServiceRpc(ManagedChannelBuilder<?> channelBuilder)
    {
        channel = channelBuilder.build();

        blockingStub = ProxyServiceGrpc.newBlockingStub(channel);
        observerStub = ProxyServiceGrpc.newStub(channel);
        observerStub.subscribeToUpdates(EmptyRequest.newBuilder().build(), new StreamObserver<UpdateResponse>()
        {
            @Override
            public void onNext(UpdateResponse updateResponse)
            {
                var event = EventType.valueOf(updateResponse.getEvent().getType().name());
                if (event == EventType.RaceRegistration)
                    notifyObservers(event, updateResponse.getEvent().getRace());
            }

            @Override
            public void onError(Throwable throwable)
            {

            }

            @Override
            public void onCompleted()
            {

            }
        });
    }

    @Override
    public boolean checkUserPassword(String username, String password)
    {
        var request = checkUserPasswordRequest.newBuilder().setUser(UserRpc.newBuilder().setUsername(username).setPassword(password)).build();
        try
        {
           var response = blockingStub.checkUserPassword(request);
           return response.getPasswordGood();
        }catch (Exception e){
            logger.error(e);
            return false;
        }
    }

    @Override
    public Iterable<Race> getRacesByClass(int raceClass)
    {
        var request = getRacesByClassRequest.newBuilder().setRaceClass(raceClass).build();
        try
        {
            var response = blockingStub.getRacesByClass(request);
            var races =  new ArrayList<Race>();
            response.getRacesList().forEach(race -> {races.add(new Race(UUID.fromString(race.getId()), race.getRaceClass(), race.getRaceName()));});
            return races;
        }
        catch (Exception e)
        {
            logger.error(e);
            return null;
        }
    }

    @Override
    public Iterable<Integer> getUsedRaceClasses()
    {
        var request = EmptyRequest.newBuilder().build();
        try
        {
            var response = blockingStub.getUsedRaceClasses(request);
            return new ArrayList<>(response.getRaceClassesList());
        }
        catch (Exception e)
        {
            logger.error(e);
            return null;
        }
    }

    @Override
    public int getRacersCountForRace(UUID raceId)
    {
        var request = getRacersCountForRaceRequest.newBuilder().setRaceId(raceId.toString()).build();
        try
        {
            var response = blockingStub.getRacersCountForRace(request);
            return response.getRacersCount();
        }
        catch (Exception e)
        {
            logger.error(e);
            return 0;
        }
    }

    @Override
    public boolean checkUserExists(String username)
    {
        var request = checkUserExistsRequest.newBuilder().setUsername(username).build();
        try
        {
            var response = blockingStub.checkUserExists(request);
            return Objects.equals(response.getStatus().toString(), "OK");
        }
        catch (Exception e)
        {
            logger.error(e);
            return false;
        }
    }

    @Override
    public Iterable<Racer> getRacersByTeam(UUID teamId)
    {
        var request = getRacersByTeamRequest.newBuilder().setTeamId(teamId.toString()).build();
        try
        {
            var response = blockingStub.getRacersByTeam(request);
            var racers = new ArrayList<Racer>();
            response.getRacersList().forEach(racer -> {
                var team = new Team(UUID.fromString(racer.getTeam().getId()), racer.getTeam().getName());
                racers.add(new Racer(UUID.fromString(racer.getId()), racer.getName(), team, racer.getCnp()));
            });
            return racers;
        }
        catch (Exception e)
        {
            logger.error(e);
            return null;
        }
    }

    @Override
    public Set<Integer> getRacerClasses(UUID racerId)
    {
        var request = getRacerClassesRequest.newBuilder().setRacerId(racerId.toString()).build();
        try
        {
            var response = blockingStub.getRacerClasses(request);
            return new HashSet<>(response.getClassesList());
        }
        catch (Exception e)
        {
            logger.error(e);
            return null;
        }
    }

    @Override
    public Iterable<Team> getTeamsByPartialName(String name)
    {
        var request = getTeamsByPartialNameRequest.newBuilder().setPartialName(name).build();
        try
        {
            var response = blockingStub.getTeamsByPartialName(request);
            var teams = new ArrayList<Team>();
            response.getTeamsList().forEach(team -> teams.add(new Team(UUID.fromString(team.getId()), team.getName())));
            return teams;
        }
        catch (Exception e)
        {
            logger.error(e);
            return null;
        }
    }

    @Override
    public Iterable<Team> getAllTeams()
    {
        var request = EmptyRequest.newBuilder().build();
        try
        {
            var response = blockingStub.getAllTeams(request);
            var teams = new ArrayList<Team>();
            response.getTeamsList().forEach(team -> teams.add(new Team(UUID.fromString(team.getId()), team.getName())));
            return teams;
        }
        catch (Exception e)
        {
            logger.error(e);
            return null;
        }
    }

    @Override
    public void addRacer(Racer racer)
    {
        var request = addRacerRequest.newBuilder().setRacer(internal.andreiva.concursmotociclism.RacerRpc.newBuilder().setId(racer.getId().toString())
                        .setName(racer.getName())
                        .setCnp(racer.getCNP()).build()).build();
        try
        {
            var response = blockingStub.addRacer(request);
            if (response.getStatus().toString().equals("OK"))
            {
                logger.info("Racer added successfully");
            }
            else
            {
                logger.error("Failed to add racer");
            }
        }
        catch (Exception e)
        {
            logger.error(e);
        }
    }

    @Override
    public Iterable<Race> getAllRaces()
    {
        var request = EmptyRequest.newBuilder().build();
        try
        {
            var response = blockingStub.getAllRaces(request);
            var races = new ArrayList<Race>();
            response.getRacesList().forEach(race -> {races.add(new Race(UUID.fromString(race.getId()), race.getRaceClass(), race.getRaceName()));});
            return races;
        }
        catch (Exception e)
        {
            logger.error(e);
            return null;
        }
    }

    @Override
    public void addRaceRegistration(String racerName, String racerCNP, String teamName, String raceName)
    {
        if (teamName == null || teamName.isEmpty())
            teamName = "";
        if (raceName == null || raceName.isEmpty())
            raceName = "";
        var request = addRaceRegistrationRequest.newBuilder()
                .setRacerName(racerName)
                .setRacerCNP(racerCNP)
                .setTeamName(teamName)
                .setRaceName(raceName)
                .build();
        try
        {
            var response = blockingStub.addRaceRegistration(request);
            if (response.getStatus().toString().equals("OK"))
            {
                logger.info("Race registration added successfully");
            }
            else
            {
                logger.error("Failed to add racer registration");
            }
        }
        catch (Exception e)
        {
            logger.error(e);
        }
    }

    @Override
    public Race getRaceByName(String raceName)
    {
        var request = getRaceByNameRequest.newBuilder().setRaceName(raceName).build();
        try
        {
            var response = blockingStub.getRaceByName(request);
            return new Race(UUID.fromString(response.getRace().getId()), response.getRace().getRaceClass(), response.getRace().getRaceName());
        }
        catch (Exception e)
        {
            logger.error(e);
            return null;
        }
    }

    @Override
    public void registerObserver(Observer observer)
    {
        observers.add(observer);
    }

    @Override
    public void unregisterObserver(Observer observer)
    {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(EventType type, Object data)
    {
        var raceRpc = (RaceRpc)data;
        var race = new Race(UUID.fromString(raceRpc.getId()), raceRpc.getRaceClass(), raceRpc.getRaceName());
        observers.forEach(observer -> observer.update(type, race));
    }


}
