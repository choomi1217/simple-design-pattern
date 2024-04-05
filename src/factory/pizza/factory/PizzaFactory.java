package factory.pizza.factory;

import factory.pizza.Pizza;
import factory.pizza.menu.*;

public class PizzaFactory {
    public Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new CheesePizza();
        } else if (type.equals("clam")) {
            return new ClamPizza();
        } else if (type.equals("pepperoni")) {
            return new PepperoniPizza();
        } else if (type.equals("veggie")) {
            return new VeggiePizza();
        } else {
            return new BasicPizza();
        }
    }
}
