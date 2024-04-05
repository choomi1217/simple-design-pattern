package factory.pizza;

import factory.pizza.factory.PizzaFactory;

public class PizzaShop {

    public PizzaShop(PizzaFactory pizzaFactory) {
        this.pizzaFactory = pizzaFactory;
    }

    public static void main(String[] args) {
        System.out.println(" ★ Pizza Shop ★ ");

        PizzaShop pizzaShop = new PizzaShop(new PizzaFactory());
        pizzaShop.oderPizza("Cheese");

    }

    private final PizzaFactory pizzaFactory;

    public void oderPizza(String type) {
        Pizza pizza = pizzaFactory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }

}
