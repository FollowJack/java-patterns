package infrastructure.factories;

import domain.behaviours.DuckCall;
import domain.behaviours.IQuackable;
import domain.entities.MallardDuck;
import domain.entities.RedHeadDuck;
import domain.entities.RubberDuck;

/**
 * Created by Deniel on 19.10.2014.
 */
public class DuckFactory extends AbstractDuckFactory {


    @Override
    public IQuackable createMallardDuck() {
        return new MallardDuck();
    }

    @Override
    public IQuackable createRedheadDuck() {
        return new RedHeadDuck();
    }

    @Override
    public IQuackable createDuckCall() {
        return new DuckCall();
    }

    @Override
    public IQuackable createRubberDuck() {
        return new RubberDuck();
    }
}
