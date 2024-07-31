package complex.duck;

import complex.observer.QuackObservable;

public interface Quackable extends QuackObservable {
    public void quack();
}
