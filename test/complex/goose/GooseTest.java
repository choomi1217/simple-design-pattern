package complex.goose;

import complex.duck.Quackable;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GooseTest {

    @Test
    void goose(){
        Quackable goose = new GooseAdapter(new Goose());
        goose.quack();
    }

}