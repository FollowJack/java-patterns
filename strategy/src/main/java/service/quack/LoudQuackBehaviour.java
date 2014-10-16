package service.quack;

/**
 * Created by Deniel on 08.10.2014.
 */
public class LoudQuackBehaviour implements IQuackBehaviour{

    @Override
    public void quack() {
        System.out.println("Quuuuaaaack! Man that's loud.");
    }
}
