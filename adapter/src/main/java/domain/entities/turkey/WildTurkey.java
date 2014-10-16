package domain.entities.turkey;

/**
 * Created by Deniel on 15.10.2014.
 */
public class WildTurkey implements ITurkey {

    @Override
    public void gobble() {
        System.out.println("Gobble gobble.");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying a short distance.");
    }


}
