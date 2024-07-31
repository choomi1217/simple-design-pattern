package complex.duck;

import complex.observer.Observable;
import complex.observer.Observer;

public class MallardDuck implements Quackable {
    private final Observable observable;

    public MallardDuck(Observable observable) {
        this.observable = observable;
    }

    @Override
    public void quack() {
        System.out.println("quack!!quack!!");
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }
}
