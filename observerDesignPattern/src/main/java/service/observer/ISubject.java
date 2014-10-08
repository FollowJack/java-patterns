package service.observer;

import service.observable.IObserver;

/**
 * Created by Deniel on 08.10.2014.
 */
public interface ISubject {

    public void registerObserver(IObserver observer);
    public void removeObserver(IObserver observer);
    public void notifyObservers();
}
