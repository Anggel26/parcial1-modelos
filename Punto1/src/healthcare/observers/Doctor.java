package healthcare.observers;

import healthcare.domain.Event;
import healthcare.domain.EventType;
import healthcare.observer.Observer;

// doctor who cares about vital signs
public class Doctor implements Observer {
    private String name;

    public Doctor(String name) {
        this.name = name;
    }

    @Override
    public void update(Event event) {
        // Filter events to only process vital signs
        if (event.getType() == EventType.VITAL_SIGNS) {
            System.out.println("Doctor " + name + " received alert: " + event.getMessage());
        }
    }
}
