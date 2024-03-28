package decorator.starbuks;

import decorator.starbuks.bevarage.HouseBlend;

public class Front {

    public static void main(String[] args) {
        System.out.println(" ★ Starbuks Coffee Shop ★ ");

        Bevarage bevarage = new HouseBlend("House Blend");
        bevarage.setMilk(true);
        bevarage.setMocha(true);
        bevarage.setSoy(false);
        bevarage.setWhip(true);

        System.out.println(bevarage.getDescription() + " $" + bevarage.cost());
    }
}
