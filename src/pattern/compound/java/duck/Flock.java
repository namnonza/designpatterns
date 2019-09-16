package pattern.compound.java.duck;

import pattern.compound.java.resource.Observable;
import pattern.compound.java.resource.Observer;
import pattern.compound.java.resource.Quackable;

import java.util.ArrayList;
import java.util.Iterator;

public class Flock implements Quackable {
    Observable observable;
    ArrayList quackers = new ArrayList();

    public void add(Quackable quacker) {
        quackers.add(quacker);
    }

    @Override
    public void quack() {
        Iterator iterator = quackers.iterator();
        while (iterator.hasNext()) {
            Quackable quacker = (Quackable)iterator.next();
            quacker.quack();
            notifyObservers();
        }
    }

    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    public void notifyObservers() {
        observable.notifyObservers();
    }
}
