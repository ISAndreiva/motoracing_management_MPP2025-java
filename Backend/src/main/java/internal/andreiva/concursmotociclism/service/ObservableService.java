package internal.andreiva.concursmotociclism.service;

import internal.andreiva.concursmotociclism.repository.*;
import internal.andreiva.concursmotociclism.utils.EventType;
import internal.andreiva.concursmotociclism.utils.Observer;

import java.util.ArrayList;
import java.util.List;

public class ObservableService extends Service implements ObservableServiceInterface
{
    private final List<Observer> observers = new ArrayList<>();
    public ObservableService(UserRepositoryInterface userRepository, TeamRepositoryInterface teamRepository, RaceRepositoryInterface raceRepository, RacerRepositoryInterface racerRepository, RaceRegistrationRepositoryInterface raceRegistrationRepository) {
        super(userRepository, teamRepository, raceRepository, racerRepository, raceRegistrationRepository);
    }

    @Override
    public void addRaceRegistration(String racerName, String racerCNP, String teamName, String raceName) {
        super.addRaceRegistration(racerName, racerCNP, teamName, raceName);
        notifyObservers(EventType.RaceRegistration, getRaceByName(raceName));
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unregisterObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(EventType type, Object data) {
        for (Observer observer : observers) {
            observer.update(type, data);
        }
    }
}
