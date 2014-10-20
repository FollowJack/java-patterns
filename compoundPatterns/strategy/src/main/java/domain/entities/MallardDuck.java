package domain.entities;

import domain.behaviours.IQuackable;
import infrastructure.observables.Observable;
import infrastructure.observers.IObserver;

/**
 * Created by Deniel on 18.10.2014.
 */
public class MallardDuck implements IQuackable{

    Observable observable;

    public MallardDuck(){
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("Quack");
        notifyObservers();
    }


    @Override
    public void registerObserver(IObserver observer) {
        observable.registerObserver(observer);

    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }
}
