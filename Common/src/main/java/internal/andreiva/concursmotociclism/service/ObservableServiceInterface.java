package internal.andreiva.concursmotociclism.service;

import internal.andreiva.concursmotociclism.utils.EventType;
import internal.andreiva.concursmotociclism.utils.Observer;

public interface ObservableServiceInterface extends ServiceInterface
{
    void registerObserver(Observer observer);

    void unregisterObserver(Observer observer);

    void notifyObservers(EventType type, Object data);
}
