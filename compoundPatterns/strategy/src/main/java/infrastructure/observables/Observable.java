package infrastructure.observables;

import infrastructure.observers.IObserver;

import java.util.ArrayList;

/**
 * Created by Deniel on 19.10.2014.
 */
public class Observable implements IQuackObservable {

    ArrayList<IObserver> observers = new ArrayList();
    IQuackObservable duck;

    public Observable(IQuackObservable duck){
        this.duck = duck;
    }

    @Override
    public void registerObserver(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for(IObserver observer : observers){
            observer.update(duck);
        }
    }
}
