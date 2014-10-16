package ui.console;

import domain.entities.Duck;
import domain.entities.MallardDuck;
import service.fly.RocketFlyBehaviour;

/**
 * Created by Deniel on 08.10.2014.
 */
public class DuckClient {

    public static void main(String[] args){

        Duck duck = new MallardDuck();
        duck.performFly();
        duck.performQuack();

        duck.setFlyBehaviour(new RocketFlyBehaviour());
        duck.performFly();
    }
}
