package pattern.compound.java.duck;

import pattern.compound.java.resource.Observable;
import pattern.compound.java.resource.Observer;
import pattern.compound.java.resource.Quackable;

public class MallardDuck implements Quackable {
    Observable observable;

    public MallardDuck(){
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("quack");
        notifyObservers();
    }

    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    public void notifyObservers() {
        observable.notifyObservers();
    }
}
