package decorator.starbuks.bevarage;

import decorator.starbuks.Bevarage;

public class Decaf extends Bevarage {

    public Decaf(String description) {
        super("Decaf");
    }

    @Override
    public double cost() {
        double cost = 2;
        if (isSoy()){
            cost =  cost + 3.5;
        }
        if (isMilk()){
            cost =  cost + 2.5;
        }
        if (isMocha()){
            cost =  cost + 1.5;
        }
        if (isWhip()){
            cost =  cost + 1.0;
        }
        return cost;
    }
}
