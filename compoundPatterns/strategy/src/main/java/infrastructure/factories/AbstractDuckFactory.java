package infrastructure.factories;

import domain.behaviours.IQuackable;

/**
 * Created by Deniel on 19.10.2014.
 */
public abstract class AbstractDuckFactory {

    public abstract IQuackable createMallardDuck();
    public abstract IQuackable createRedheadDuck();
    public abstract IQuackable createDuckCall();
    public abstract IQuackable createRubberDuck();

}
