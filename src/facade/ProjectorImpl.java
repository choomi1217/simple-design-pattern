package facade;

public class ProjectorImpl implements Projector{
    @Override
    public void on() {
        System.out.println("Projector is on");
    }

    @Override
    public void off() {
        System.out.println("Projector is off");
    }

    @Override
    public void wideScreenMode() {
        System.out.println("Projector is set to wide screen mode");
    }

    @Override
    public void tvMode() {
        System.out.println("Projector is set to TV mode");
    }
}
