package factory.pizza.factory;

import factory.pizza.menu.Pizza;
import factory.pizza.menu.*;

public class PizzaFactory {
    public Pizza createPizza(String type) {
        return switch (type) {
            case "cheese" -> new CheesePizza();
            case "clam" -> new ClamPizza();
            case "pepperoni" -> new PepperoniPizza();
            case "veggie" -> new VeggiePizza();
            default -> new BasicPizza();
        };
    }
}
