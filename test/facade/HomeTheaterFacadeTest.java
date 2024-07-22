package facade;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HomeTheaterFacadeTest {

    Amplifier amplifier = new AmplifierImpl();
    Tuner tuner = new TunerImpl();
    Projector projector = new ProjectorImpl();

    @Test
    void main() {
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(amplifier, tuner, projector);
        homeTheaterFacade.watchMovie();
        homeTheaterFacade.endMovie();
    }

}