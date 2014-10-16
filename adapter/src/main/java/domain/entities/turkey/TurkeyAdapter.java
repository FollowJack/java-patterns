package domain.entities.turkey;

import domain.entities.duck.IDuck;

/**
 * Created by Deniel on 15.10.2014.
 */
public class TurkeyAdapter implements IDuck {

    private ITurkey turkey;

    public TurkeyAdapter(ITurkey turkey){
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        for (int i = 0; i < 5; i++) {
            turkey.fly();
        }
    }
}
