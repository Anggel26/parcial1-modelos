package healthcare.observers;

import healthcare.domain.Event;
import healthcare.domain.EventType;
import healthcare.observer.Observer;

// bacteriologist who cares about lab tests
public class Bacteriologist implements Observer {
    private String name;

    public Bacteriologist(String name) {
        this.name = name;
    }

    @Override
    public void update(Event event) {
        // filter events to only process lab tests
        if (event.getType() == EventType.LAB_TEST) {
            System.out.println("Bacteriologist " + name + " received alert: " + event.getMessage());
        }
    }
}
