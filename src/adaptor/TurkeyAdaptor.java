package adaptor;

public class TurkeyAdaptor implements Duck {
    Turkey turkey;

    public TurkeyAdaptor(Turkey turkey) {
        this.turkey = turkey;
    }

    public void quack() {
        turkey.gobble();
    }

    public void fly() {
        System.out.println("I'm flying a short distance");
    }
}
