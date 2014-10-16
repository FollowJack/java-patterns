package domain.entities;

/**
 * Created by Deniel on 15.10.2014.
 */
public class Coffee extends CaffeineBeverage {

    @Override
    protected void brew() {
        System.out.println("Dripping coffee through filter.");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding sugar and milk.");
    }

    @Override
    protected boolean customerWantsCondiments(){
        System.out.println("Call hook method if customer wants condiment.");
        return false;
    }
}
