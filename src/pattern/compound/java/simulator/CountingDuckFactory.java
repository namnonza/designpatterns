package pattern.compound.java.simulator;

import pattern.compound.java.duck.DuckCall;
import pattern.compound.java.duck.MallardDuck;
import pattern.compound.java.duck.RedheadDuck;
import pattern.compound.java.duck.RubberDuck;
import pattern.compound.java.resource.QuackCounter;
import pattern.compound.java.resource.Quackable;

public class CountingDuckFactory extends AbstractDuckFactory {

    @Override
    public Quackable createMallardDuck() {
        return new QuackCounter(new MallardDuck());
    }

    @Override
    public Quackable createRedheadDuck() {
        return new QuackCounter(new RedheadDuck());
    }

    @Override
    public Quackable createDuckCall() {
        return new QuackCounter(new DuckCall());
    }

    @Override
    public Quackable createRubberDuck() {
        return new QuackCounter(new RubberDuck());
    }
}
