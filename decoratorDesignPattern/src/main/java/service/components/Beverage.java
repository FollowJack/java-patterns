package service.components;

/**
 * Created by Deniel on 09.10.2014.
 */
public abstract class Beverage {
    String description = "unknown beverage";

    public String getDescription(){
        return description;
    }

    public abstract double cost();

}
