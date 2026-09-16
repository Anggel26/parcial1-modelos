package globalmarket.strategy;

// locker pickup shipping strategy
public class LockerShipping implements ShippingStrategy {
    @Override
    public double calculateShippingCost(double weight, double distance) {
        // flat fee based mainly on distance to distribution center
        return 5.0 + distance * 0.05;
    }

    @Override
    public String getShippingDescription() {
        return "Locker collection: Flat fee depending on distance.";
    }
}
