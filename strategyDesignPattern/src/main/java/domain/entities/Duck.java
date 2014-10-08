package domain.entities;

import service.fly.IFlyBehaviour;
import service.quack.IQuackBehaviour;

/**
 * Created by Deniel on 07.10.2014.
 */
public abstract class Duck {

    private IFlyBehaviour flyBehaviour;
    private IQuackBehaviour quackBehaviour;


    public Duck(){}


    public void setFlyBehaviour(IFlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public void setQuackBehaviour(IQuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }

    public void performQuack(){
        quackBehaviour.quack();
    }

    public void performFly(){
        flyBehaviour.fly();
    }
}
