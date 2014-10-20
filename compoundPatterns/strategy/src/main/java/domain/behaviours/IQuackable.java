package domain.behaviours;

import infrastructure.observables.IQuackObservable;

/**
 * Created by Deniel on 18.10.2014.
 */
public interface IQuackable extends IQuackObservable {
    public void quack();
}
