package internal.andreiva.concursmotociclism.client;

import internal.andreiva.concursmotociclism.communication.Request;
import internal.andreiva.concursmotociclism.communication.RequestType;
import internal.andreiva.concursmotociclism.communication.Response;
import internal.andreiva.concursmotociclism.communication.ResponseType;
import internal.andreiva.concursmotociclism.domain.Race;
import internal.andreiva.concursmotociclism.domain.Racer;
import internal.andreiva.concursmotociclism.domain.Team;
import internal.andreiva.concursmotociclism.dto.*;
import internal.andreiva.concursmotociclism.service.ServiceInterface;
import internal.andreiva.concursmotociclism.utils.Event;
import internal.andreiva.concursmotociclism.utils.EventType;
import internal.andreiva.concursmotociclism.utils.Observer;

import java.io.IOException;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;


public class ProxyService extends AbstractProxyService implements ServiceInterface
{
    private Observer guiController = null;
    private Dictionary<Race, Integer> raceRacersNoCache = null;
    private volatile boolean cacheValid = false;

    public ProxyService(String host, int port)
    {
        super(host, port);
    }

    public ProxyService()
    {
        super();
    }

    @Override
    protected void handleUpdate(Response response)
    {
        logger.info("Handling update: {}", response.toString());
        var event = (Event) response.data();
        if (event.type() == EventType.RaceRegistration)
            if (guiController != null)
            {
                cacheValid = false;
                guiController.update(event.type(), ((RaceDTO) event.data()).toRace());
            }
    }

    public void setGuiController(Observer guiController)
    {
        this.guiController = guiController;
    }

    @Override
    public boolean checkUserPassword(String username, String password)
    {
        try
        {
            testConnection();
        } catch (IOException e)
        {
            initConnection();
        }
        var userCrediantialsDTO = new UserCrediantialsDTO(username, password);
        sendRequest(new Request(RequestType.CheckUserPassword, userCrediantialsDTO));
        var response = readResponse();
        return response.type() == ResponseType.Ok;
    }

    @Override
    public Iterable<Race> getRacesByClass(int raceClass)
    {
        try
        {
            testConnection();
        } catch (IOException e)
        {
            logger.error(e);
            return null;
        }
        sendRequest(new Request(RequestType.GetRacesByClass, raceClass));
        var response = readResponse();
        if (response.type() == ResponseType.GetRacesByClass)
        {
            var races = new ArrayList<Race>();
            var racesDTO = (ArrayList<RaceDTO>) response.data();
            racesDTO.forEach(r -> races.add(r.toRace()));

            return races;
        }
        return null;
    }

    @Override
    public Iterable<Integer> getUsedRaceClasses()
    {
        try
        {
            testConnection();
        } catch (IOException e)
        {
            logger.error(e);
            return null;
        }
        sendRequest(new Request(RequestType.GetUsedRaceClasses, null));
        var response = readResponse();
        if (response.type() == ResponseType.GetUsedRaceClasses)
        {
            return (List<Integer>) response.data();
        }
        return null;
    }

    @Override
    public int getRacersCountForRace(UUID raceId)
    {
        try
        {
            testConnection();
        } catch (IOException e)
        {
            logger.error(e);
            return -1;
        }
        if (!cacheValid)
        {
            updateCache();
        }
        AtomicReference<Race> race = new AtomicReference<>();
        raceRacersNoCache.keys().asIterator().forEachRemaining(r -> {if (r.getId().equals(raceId))
            race.set(r);
        });
        return raceRacersNoCache.get(race.get());
    }

    @Override
    public boolean checkUserExists(String username)
    {
        try
        {
            testConnection();
        } catch (IOException e)
        {
            initConnection();
        }
        sendRequest(new Request(RequestType.CheckUserExists, username));
        var response = readResponse();
        return response.type() == ResponseType.Ok;
    }

    @Override
    public Iterable<Racer> getRacersByTeam(UUID teamId)
    {
        try
        {
            testConnection();
        }catch (IOException e)
        {
            logger.error(e);
            return null;
        }
        sendRequest(new Request(RequestType.GetRacersByTeam, teamId));
        var response = readResponse();
        if (response.type() == ResponseType.GetRacersByTeam)
        {
            var racers = new ArrayList<Racer>();
            var racersDTO = (ArrayList<RacerDTO>) response.data();
            racersDTO.forEach(r -> racers.add(r.toRacer()));
            return racers;
        }
        return null;
    }

    @Override
    public Set<Integer> getRacerClasses(UUID racerId)
    {
        try
        {
            testConnection();
        }catch (IOException e)
        {
            logger.error(e);
            return null;
        }
        sendRequest(new Request(RequestType.GetRacerClasses, racerId));
        var response = readResponse();
        if (response.type() == ResponseType.GetRacerClasses)
        {
            return (Set<Integer>) response.data();
        }
        return null;
    }

    @Override
    public Iterable<Team> getTeamsByPartialName(String name)
    {
        try
        {
            testConnection();
        }catch (IOException e)
        {
            logger.error(e);
            return null;
        }
        sendRequest(new Request(RequestType.GetTeamsByPartialName, name));
        var response = readResponse();
        if (response.type() == ResponseType.GetTeamsByPartialName)
        {
            var teams = new ArrayList<Team>();
            var teamsDTO = (ArrayList<TeamDTO>) response.data();
            teamsDTO.forEach(t -> teams.add(t.toTeam()));
            return teams;
        }
        return null;
    }

    @Override
    public Iterable<Team> getAllTeams()
    {
        try
        {
            testConnection();
        }catch (IOException e)
        {
            logger.error(e);
            return null;
        }
        sendRequest(new Request(RequestType.GetAllTeams, null));
        var response = readResponse();
        if (response.type() == ResponseType.GetAllTeams)
        {
            var teams = new ArrayList<Team>();
            var teamsDTO = (ArrayList<TeamDTO>) response.data();
            teamsDTO.forEach(t -> teams.add(t.toTeam()));
            return teams;
        }
        return null;
    }

    @Override
    public void addRacer(Racer racer)
    {
        try
        {
            testConnection();
        }catch (IOException e)
        {
            logger.error(e);
            return;
        }
        var racerDTO = RacerDTO.fromRacer(racer);
        sendRequest(new Request(RequestType.AddRacer, racerDTO));
        var response = readResponse();
        if (response.type() != ResponseType.Ok)
        {
            logger.error("Error adding racer: {}", response.data());
        }
    }

    @Override
    public Iterable<Race> getAllRaces()
    {
        try
        {
            testConnection();
        }catch (IOException e)
        {
            logger.error(e);
            return null;
        }
        if (!cacheValid)
        {
            updateCache();
        }
        return Collections.list(raceRacersNoCache.keys());
    }

    @Override
    public void addRaceRegistration(String racerName, String racerCNP, String teamName, String raceName)
    {
        try
        {
            testConnection();
        }catch (IOException e)
        {
            logger.error(e);
            return;
        }
        var raceRegistrationDTO = new RaceRegistrationDTO(racerName, racerCNP, teamName, raceName);
        sendRequest(new Request(RequestType.AddRaceRegistration, raceRegistrationDTO));
        var response = readResponse();
        if (response.type() != ResponseType.Ok)
        {
            logger.error("Error adding race registration: {}", response.data());
        }
    }

    @Override
    public Race getRaceByName(String raceName)
    {
        try
        {
            testConnection();
        }catch (IOException e)
        {
            logger.error(e);
            return null;
        }
        sendRequest(new Request(RequestType.GetRaceByName, raceName));
        var response = readResponse();
        if (response.type() == ResponseType.GetRaceByName)
        {
            return ((RaceDTO) response.data()).toRace();
        }
        return null;
    }

    private void updateCache()
    {
        logger.info("Updating cache");
        try
        {
            testConnection();
        }catch (IOException e)
        {
            logger.error(e);
        }
        raceRacersNoCache = new Hashtable<>();
        sendRequest(new Request(RequestType.GetRacesAndRacersNo, null));
        var response = readResponse();
        if (response.type() == ResponseType.GetRacesAndRacersNo)
        {
            var dict = (HashMap<RaceDTO, Integer>) response.data();
            dict.forEach((r, n) -> {
                raceRacersNoCache.put(r.toRace(), n);
            });
        }
        cacheValid = true;
    }
}
