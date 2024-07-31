package complex.goose;

import complex.duck.Quackable;
import complex.observer.Observer;

public class GooseAdapter implements Quackable {
    private final Goose goose;

    public GooseAdapter(Goose goose) {
        this.goose = goose;
    }

    @Override
    public void quack() {
        goose.honk();
    }


    @Override
    public void registerObserver(Observer duck) {

    }

    @Override
    public void notifyObservers() {

    }
}
