package healthcare.observers;

import healthcare.domain.Event;
import healthcare.domain.EventType;
import healthcare.observer.Observer;

// nurse who cares about priority changes
public class Nurse implements Observer {
    private String name;

    public Nurse(String name) {
        this.name = name;
    }

    @Override
    public void update(Event event) {
        // filter events to only process priority changes
        if (event.getType() == EventType.PRIORITY_CHANGE) {
            System.out.println("Nurse " + name + " received alert: " + event.getMessage());
        }
    }
}
