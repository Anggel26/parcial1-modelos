package healthcare.domain;

// represents a generic event in the system
public class Event {
    private EventType type;
    private String message;

    public Event(EventType type, String message) {
        this.type = type;
        this.message = message;
    }

    public EventType getType() {
        return type;
    }

    public String getMessage() {
        return message;
    }
}
