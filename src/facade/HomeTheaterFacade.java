package facade;

public class HomeTheaterFacade {
    private final Amplifier amp;
    private final Tuner tuner;
    private final Projector projector;

    public HomeTheaterFacade(Amplifier amp, Tuner tuner, Projector projector) {
        this.amp = amp;
        this.tuner = tuner;
        this.projector = projector;
    }


    public void watchMovie() {
        System.out.println("Get ready to watch a movie...");
        amp.on();
        amp.setSurroundSound();
        amp.setVolume(5);
        tuner.on();
        tuner.setAm();
        projector.on();
        projector.wideScreenMode();
    }

    public void endMovie() {
        System.out.println("Shutting movie theater down...");
        amp.off();
        tuner.off();
        projector.off();
    }
}
