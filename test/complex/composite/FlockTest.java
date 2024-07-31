package complex.composite;

import complex.decorator.QuackCounter;
import complex.duck.Quackable;
import complex.factory.AbstractDuckFactory;
import complex.factory.CountingDuckFactory;
import org.junit.jupiter.api.Test;

class FlockTest {

    @Test
    void quack() {

        AbstractDuckFactory duckFactoryCounting = new CountingDuckFactory();

        Quackable mallardDuck = duckFactoryCounting.createMallardDuck();
        Quackable redHeadDuck = duckFactoryCounting.createRedheadDuck();
        Quackable duckCall = duckFactoryCounting.createDuckCall();
        Quackable rubberDuck = duckFactoryCounting.createRubberDuck();
        Quackable gooseDuck = duckFactoryCounting.createGooseDuck();

        Flock flock = new Flock();
        flock.add(mallardDuck);
        flock.add(redHeadDuck);
        flock.add(duckCall);
        flock.add(rubberDuck);
        flock.add(gooseDuck);

        flock.quack();
        System.out.println(QuackCounter.getCount());

    }
}