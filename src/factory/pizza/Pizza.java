package factory.pizza;

import factory.pizza.menu.CheesePizza;
import factory.pizza.menu.ClamPizza;
import factory.pizza.menu.PepperoniPizza;
import factory.pizza.menu.VeggiePizza;

public class Pizza {

    public Pizza oderPizza(String type) {
        Pizza pizza;

        if(type.equals("Cheese")){
            pizza = new CheesePizza();
        }
        else if(type.equals("Pepperoni")){
            pizza = new PepperoniPizza();
        }
        else if(type.equals("Clam")){
            pizza = new ClamPizza();
        }
        else if(type.equals("Veggie")){
            pizza = new VeggiePizza();
        }else {
            pizza = new Pizza();
        }

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

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
