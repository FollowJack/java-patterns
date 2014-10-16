package domain.entities;

/**
 * Created by Deniel on 15.10.2014.
 */
public abstract class CaffeineBeverage {

    public void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        if(customerWantsCondiments())
        addCondiments();
    }

    protected boolean customerWantsCondiments(){
        return true;
    }

    protected void boilWater(){
        System.out.println("Boil water.");
    }

    protected abstract void brew();

    protected void pourInCup(){
        System.out.println("Pour in cup.");
    }

    protected abstract void addCondiments();
}
