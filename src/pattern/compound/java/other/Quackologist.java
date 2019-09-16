package pattern.compound.java.other;

import pattern.compound.java.resource.Observer;
import pattern.compound.java.resource.QuackObservable;

public class Quackologist implements Observer {
    public void update(QuackObservable duck) {
        System.out.println("Quackologist: " + duck + " just quacked.");
    }
}
