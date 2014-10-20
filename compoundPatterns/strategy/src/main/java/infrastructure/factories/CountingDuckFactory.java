package infrastructure.factories;

import domain.behaviours.DuckCall;
import domain.behaviours.IQuackable;
import domain.entities.MallardDuck;
import domain.entities.RedHeadDuck;
import domain.entities.RubberDuck;
import infrastructure.dcorators.QuackCounter;

/**
 * Created by Deniel on 19.10.2014.
 */
public class CountingDuckFactory extends AbstractDuckFactory {

    @Override
    public IQuackable createMallardDuck() {
        return new QuackCounter(new MallardDuck());
    }

    @Override
    public IQuackable createRedheadDuck() {
        return new QuackCounter(new RedHeadDuck());
    }

    @Override
    public IQuackable createDuckCall() {
        return new QuackCounter(new DuckCall());
    }

    @Override
    public IQuackable createRubberDuck() {
        return new QuackCounter(new RubberDuck());
    }
}
