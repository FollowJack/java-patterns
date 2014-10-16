package domain.entities;

/**
 * Created by Deniel on 15.10.2014.
 */
public class Tea extends CaffeineBeverage {

    @Override
    protected void brew() {
        System.out.println("Steeping the tea.");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding lemon.");
    }
}
