package facade;

public class TunerImpl implements Tuner {
    @Override
    public void on() {
        System.out.println("Tuner on");
    }

    @Override
    public void off() {
        System.out.println("Tuner off");
    }

    @Override
    public void setAm() {
        System.out.println("Tuner set to AM");
    }

    @Override
    public void setFm() {
        System.out.println("Tuner set to FM");
    }
}
