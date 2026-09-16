package globalmarket.strategy;

// strategy interface for shipping calculations
public interface ShippingStrategy {
    double calculateShippingCost(double weight, double distance);
    String getShippingDescription();
}
