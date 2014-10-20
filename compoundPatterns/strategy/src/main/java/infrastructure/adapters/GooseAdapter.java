package infrastructure.adapters;

import domain.behaviours.IQuackable;
import domain.entities.Goose;
import infrastructure.observers.IObserver;

/**
 * Created by Deniel on 18.10.2014.
 */
public class GooseAdapter implements IQuackable {

    Goose goose;

    public GooseAdapter(Goose goose){
        this.goose = goose;
    }

    @Override
    public void quack() {
        goose.honk();
    }

    @Override
    public void registerObserver(IObserver observer) {

    }

    @Override
    public void notifyObservers() {

    }
}
