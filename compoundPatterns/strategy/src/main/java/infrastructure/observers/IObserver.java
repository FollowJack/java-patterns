package infrastructure.observers;

import infrastructure.observables.IQuackObservable;

/**
 * Created by Deniel on 19.10.2014.
 */
public interface IObserver {
    public void update(IQuackObservable duck);
}
