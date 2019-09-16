package pattern.compound.java.duck;

import pattern.compound.java.resource.Observable;
import pattern.compound.java.resource.Observer;
import pattern.compound.java.resource.Quackable;

public class DuckCall implements Quackable {
    Observable observable;

    public DuckCall(){
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("Kwak");
        notifyObservers();
    }

    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    public void notifyObservers() {
        observable.notifyObservers();
    }
}
