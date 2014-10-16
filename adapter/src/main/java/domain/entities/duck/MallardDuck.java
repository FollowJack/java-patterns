package domain.entities.duck;

import domain.entities.duck.IDuck;

/**
 * Created by Deniel on 15.10.2014.
 */
public class MallardDuck implements IDuck {

    @Override
    public void quack() {
        System.out.println("Quack.");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying.");
    }
}
