package globalmarket;

import globalmarket.context.Order;
import globalmarket.strategy.EcoShipping;
import globalmarket.strategy.EconomicShipping;
import globalmarket.strategy.ExpressShipping;
import globalmarket.strategy.LockerShipping;

// main class to demonstrate the strategy pattern
public class Main {
    public static void main(String[] args) {
        double weight = 10.5; // kg
        double distance = 500.0; // km

        // initial order with economic shipping
        Order order = new Order(weight, distance, new EconomicShipping());
        order.checkout();

        // user changes mind to express shipping in checkout window
        order.setShippingStrategy(new ExpressShipping());
        order.checkout();

        // changing to eco shipping
        order.setShippingStrategy(new EcoShipping());
        order.checkout();

        // changing to locker pickup
        order.setShippingStrategy(new LockerShipping());
        order.checkout();
    }
}
