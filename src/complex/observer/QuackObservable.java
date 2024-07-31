package complex.observer;

public interface QuackObservable {
    public void registerObserver(Observer duck);
    public void notifyObservers();
}
