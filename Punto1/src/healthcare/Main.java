package healthcare;

import healthcare.domain.Event;
import healthcare.domain.EventType;
import healthcare.observers.Bacteriologist;
import healthcare.observers.Doctor;
import healthcare.observers.Nurse;
import healthcare.subject.CentralMonitor;

// Main class to demonstrate the observer pattern
public class Main {
    public static void main(String[] args) {
        CentralMonitor monitor = new CentralMonitor();

        Doctor elena = new Doctor("Elena Ramos");
        Nurse andres = new Nurse("Andrés Suárez");
        Bacteriologist marta = new Bacteriologist("Marta Gómez");

        // professionals subscribe to the monitor
        monitor.registerObserver(elena);
        monitor.registerObserver(andres);
        monitor.registerObserver(marta);

        // simulate events coming from biomédic devices
        monitor.receiveEvent(new Event(EventType.VITAL_SIGNS, "Severe drop in oxygen saturation"));
        monitor.receiveEvent(new Event(EventType.PRIORITY_CHANGE, "Code blue in room 204"));
        monitor.receiveEvent(new Event(EventType.LAB_TEST, "Urgent blood test for Patient 10"));

        // Test unsubscribing
        monitor.removeObserver(andres);
        System.out.println("\nAfter Andrés unsubscribes");
        // verifying that the nurse has successfully unsubscribed
        monitor.receiveEvent(new Event(EventType.PRIORITY_CHANGE, "Code red in room 101"));
    }
}
