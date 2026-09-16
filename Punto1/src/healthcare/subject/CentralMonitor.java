package healthcare.subject;

import healthcare.domain.Event;
import healthcare.observer.Observer;
import healthcare.observer.Subject;
import java.util.ArrayList;
import java.util.List;

// central monitor acting as the observable subject
public class CentralMonitor implements Subject {
    private List<Observer> observers;

    public CentralMonitor() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers(Event event) {
        for (Observer observer : observers) {
            observer.update(event);
        }
    }

    // Method to simulate incoming events from devices
    public void receiveEvent(Event event) {
        notifyObservers(event);
    }
}
