package factory.pizza.store;

import factory.pizza.menu.Pizza;
import factory.pizza.factory.PizzaFactory;

public abstract class PizzaStore {

    private final PizzaFactory pizzaFactory = new PizzaFactory();

    public Pizza oderPizza(String type) {
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    protected abstract Pizza createPizza(String type);

}
