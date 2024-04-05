package factory.pizza;

import factory.pizza.store.NYPizzaStore;
import factory.pizza.store.PizzaStore;

public class App {

    public static void main(String[] args) {
        System.out.println(" ★ Pizza Shop ★ ");
        PizzaStore pizzaStore = new NYPizzaStore();
        pizzaStore.oderPizza("cheese");
    }

}
