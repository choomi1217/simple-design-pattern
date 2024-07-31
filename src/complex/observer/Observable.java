package complex.observer;

import java.util.ArrayList;
import java.util.List;

public class Observable implements QuackObservable {

    private final List<Observer> observers = new ArrayList<>();
    private final QuackObservable duck;

    public Observable(QuackObservable duck) {
        this.duck = duck;
    }

    @Override
    public void registerObserver(Observer observable) {
        observers.add(observable);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(duck);
        }
    }
}
