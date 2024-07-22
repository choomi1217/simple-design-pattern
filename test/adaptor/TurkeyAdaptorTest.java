package adaptor;

import org.junit.jupiter.api.Test;

class TurkeyAdaptorTest {

    @Test
    void quack() {
        Turkey turkey = new WildTurkey();
        Duck turkeyAdaptor = new TurkeyAdaptor(turkey);
        turkeyAdaptor.quack();
        turkeyAdaptor.fly();
    }

}