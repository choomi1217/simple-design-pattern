package facade;

public class AmplifierImpl implements Amplifier {
    @Override
    public void on() {
        System.out.println("Amplifier is on");
    }

    @Override
    public void off() {
        System.out.println("Amplifier is off");
    }

    @Override
    public void setSurroundSound() {
        System.out.println("Amplifier is set to surround sound");
    }

    @Override
    public void setVolume(int volume) {
        System.out.println("Amplifier volume is set to " + volume);
    }
}
