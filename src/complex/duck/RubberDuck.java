package complex.duck;

import complex.observer.Observable;
import complex.observer.Observer;

public class RubberDuck implements Quackable {

    private final Observable observable;

    public RubberDuck(Observable observable) {
        this.observable = observable;
    }

    @Override
    public void quack() {
        System.out.println("삑-!삑-!");
    }

    @Override
    public void registerObserver(Observer duck) {
        observable.registerObserver(duck);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }
}
