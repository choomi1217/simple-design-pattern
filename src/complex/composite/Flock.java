package complex.composite;

import complex.duck.Quackable;
import complex.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class Flock implements Quackable {

    private final List<Quackable> quackers = new ArrayList<>();

    public void add(Quackable quacker) {
        quackers.add(quacker);
    }

    @Override
    public void quack() {
        for (Quackable quacker : quackers) {
            quacker.quack();
        }
    }

    @Override
    public void registerObserver(Observer observer) {
        for (Quackable quacker : quackers) {
            quacker.registerObserver(observer);
        }
    }

    @Override
    public void notifyObservers() {
        for (Quackable quacker : quackers) {
            quacker.notifyObservers();
        }
    }
}
