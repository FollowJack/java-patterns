package infrastructure.observers;

import infrastructure.observables.IQuackObservable;

/**
 * Created by Deniel on 19.10.2014.
 */
public class Quackologist implements IObserver {
    @Override
    public void update(IQuackObservable duck) {
        System.out.println("Quackologist: "+duck+" just quacked.");
    }
}
