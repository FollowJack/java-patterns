package domain.behaviours;

import infrastructure.observables.Observable;
import infrastructure.observers.IObserver;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Deniel on 19.10.2014.
 */
public class Flock implements IQuackable{

    ArrayList<IQuackable> quackers = new ArrayList();

    public void add(IQuackable quacker){
        quackers.add(quacker);
    }

    @Override
    public void quack() {
        Iterator iterator = quackers.iterator();
        for(IQuackable quacker : quackers){
            quacker.quack();
            notifyObservers();
        }
    }

    Observable observable;

    public Flock(){
        observable = new Observable(this);

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
