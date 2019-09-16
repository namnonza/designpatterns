package pattern.compound.java.other;

import pattern.compound.java.resource.Observable;
import pattern.compound.java.resource.Observer;
import pattern.compound.java.resource.Quackable;

public class GooseAdaptor implements Quackable {
    Goose goose;
    Observable observable;

    public GooseAdaptor(){
        observable = new Observable(this);
    }

    public GooseAdaptor(Goose goose) {
        this.goose = goose;
    }

    @Override
    public void quack() {
        goose.honk();
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }
}
