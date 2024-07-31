package complex.duck;

import complex.observer.Observable;
import complex.observer.Observer;

public class DuckCall implements Quackable {

    private final Observable observable;

    public DuckCall(Observable observable) {
        this.observable = observable;
    }

    @Override
    public void quack() {
        System.out.println("quack-!!quack-!!🤖");
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
