package pattern.compound.java.simulator;

import pattern.compound.java.duck.DuckCall;
import pattern.compound.java.duck.MallardDuck;
import pattern.compound.java.duck.RedheadDuck;
import pattern.compound.java.duck.RubberDuck;
import pattern.compound.java.resource.Quackable;

public class DuckFactory extends AbstractDuckFactory {

    @Override
    public Quackable createMallardDuck() {
        return new MallardDuck();
    }

    @Override
    public Quackable createRedheadDuck() {
        return new RedheadDuck();
    }

    @Override
    public Quackable createDuckCall() {
        return new DuckCall();
    }

    @Override
    public Quackable createRubberDuck() {
        return new RubberDuck();
    }
}
