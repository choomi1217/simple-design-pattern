package complex.factory;

import complex.decorator.QuackCounter;
import complex.duck.Quackable;
import org.junit.jupiter.api.Test;

class DuckFactoryTest {

    @Test
    void duckTest() {
        AbstractDuckFactory duckFactoryCounting = new CountingDuckFactory();

        Quackable mallardDuck = duckFactoryCounting.createMallardDuck();
        Quackable redHeadDuck = duckFactoryCounting.createRedheadDuck();
        Quackable duckCall = duckFactoryCounting.createDuckCall();
        Quackable rubberDuck = duckFactoryCounting.createRubberDuck();
        Quackable gooseDuck = duckFactoryCounting.createGooseDuck();

        mallardDuck.quack();
        redHeadDuck.quack();
        duckCall.quack();
        rubberDuck.quack();
        gooseDuck.quack();

        System.out.println(QuackCounter.getCount());
    }

}