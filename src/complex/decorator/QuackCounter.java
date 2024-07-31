package complex.decorator;

import complex.duck.Quackable;

public class QuackCounter implements Quackable {
    private static int COUNT;
    private Quackable quackableAnimal;

    public QuackCounter(Quackable quackableAnimal) {
        this.quackableAnimal = quackableAnimal;
    }

    @Override
    public void quack() {
        quackableAnimal.quack();
        COUNT++;
    }

    public static int getCount() {
        return COUNT;
    }
}
