package infrastructure.dcorators;

import domain.behaviours.IQuackable;
import infrastructure.observers.IObserver;

/**
 * Created by Deniel on 18.10.2014.
 */
public class QuackCounter implements IQuackable {

    IQuackable duck;
    static int numberOfQuacks;

    public QuackCounter(IQuackable duck){
        this.duck = duck;
    }

    @Override
    public void quack() {
        duck.quack();
        numberOfQuacks++;
    }

    public static int getQuacks(){
        return numberOfQuacks;
    }


    @Override
    public void registerObserver(IObserver observer) {

    }

    @Override
    public void notifyObservers() {

    }
}
