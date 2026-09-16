package globalmarket.strategy;

// eco-friendly shipping strategy (carbon neutral)
public class EcoShipping implements ShippingStrategy {
    @Override
    public double calculateShippingCost(double weight, double distance) {
        // cost benefit price, electric and land transport
        return weight * 1.5 + distance * 0.1;
    }

    @Override
    public String getShippingDescription() {
        return "Eco shipping (Carbon Neutral): Land and electric routes.";
    }
}
