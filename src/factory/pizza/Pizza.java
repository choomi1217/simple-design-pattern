package factory.pizza;

import factory.pizza.factory.PizzaFactory;

public class Pizza {

    public void prepare() {
        System.out.println("Preparing pizza...");
    }

    public void bake() {
        System.out.println("Baking pizza...");
    }

    public void cut() {
        System.out.println("Cutting pizza...");
    }

    public void box() {
        System.out.println("Boxing pizza...");
    }
}
