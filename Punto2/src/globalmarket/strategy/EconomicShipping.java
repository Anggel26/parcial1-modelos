package globalmarket.strategy;

// economic shipping strategy (maritime)
public class EconomicShipping implements ShippingStrategy {
    @Override
    public double calculateShippingCost(double weight, double distance) {
        // very low cost, takes long time
        return weight * 0.5 + distance * 0.01;
    }

    @Override
    public String getShippingDescription() {
        return "Economic shipping (Maritime): Low cost, a lot of weeks.";
    }
}
