package pattern.compound.java.resource;

public interface QuackObservable {
    public void registerObserver(Observer observer);
    public void notifyObservers();
}
