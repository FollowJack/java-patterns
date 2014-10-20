package infrastructure.observables;


import infrastructure.observers.IObserver;

/**
 * Created by Deniel on 19.10.2014.
 */
public interface IQuackObservable {
    public void registerObserver(IObserver observer);
    public void notifyObservers();
}
