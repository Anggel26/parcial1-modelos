package globalmarket.strategy;

// express shipping strategy (air)
public class ExpressShipping implements ShippingStrategy {
    @Override
    public double calculateShippingCost(double weight, double distance) {
        // high cost, fast delivery
        return weight * 3.0 + distance * 0.5;
    }

    @Override
    public String getShippingDescription() {
        return "Express shipping (Air): High cost,short delivery time.";
    }
}
