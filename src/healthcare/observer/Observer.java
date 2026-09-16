package healthcare.observer;

import healthcare.domain.Event;

// observer interface for profesionals
public interface Observer {
    void update(Event event);
}
