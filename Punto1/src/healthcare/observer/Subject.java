package healthcare.observer;

import healthcare.domain.Event;

// subject interface for the monitor
public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers(Event event);
}
