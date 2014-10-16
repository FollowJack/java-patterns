package domain.entities;

import service.fly.FlySlowBehaviour;
import service.quack.LoudQuackBehaviour;

/**
 * Created by Deniel on 08.10.2014.
 */
public class MallardDuck extends Duck {

    public MallardDuck(){
        setFlyBehaviour(new FlySlowBehaviour());
        setQuackBehaviour(new LoudQuackBehaviour());
    }
}
