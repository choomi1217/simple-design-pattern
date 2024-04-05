package factory.pizza.store;

import factory.pizza.menu.Pizza;
import factory.pizza.menu.*;
import factory.pizza.menu.newyork.NYStyleCheesePizza;
import factory.pizza.menu.newyork.NYStyleClamPizza;
import factory.pizza.menu.newyork.NYStylePepperoniPizza;
import factory.pizza.menu.newyork.NYStyleVeggiePizza;

public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        return switch (type) {
            case "cheese" -> new NYStyleCheesePizza();
            case "clam" -> new NYStyleClamPizza();
            case "pepperoni" -> new NYStylePepperoniPizza();
            case "veggie" -> new NYStyleVeggiePizza();
            default -> new BasicPizza();
        };
    }
}
