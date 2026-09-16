package globalmarket.context;

import globalmarket.strategy.ShippingStrategy;

// Context class representing an order
public class Order {
    private double weight;
    private double distance;
    private ShippingStrategy shippingStrategy;

    public Order(double weight, double distance, ShippingStrategy shippingStrategy) {
        this.weight = weight;
        this.distance = distance;
        this.shippingStrategy = shippingStrategy;
    }

    public void setShippingStrategy(ShippingStrategy shippingStrategy) {
        this.shippingStrategy = shippingStrategy;
    }

    public void checkout() {
        System.out.println("Order Checkout");
        System.out.println("Methodo: " + shippingStrategy.getShippingDescription());
        System.out.println("Total Shipping Cost: $" + shippingStrategy.calculateShippingCost(weight, distance));
    }
}
