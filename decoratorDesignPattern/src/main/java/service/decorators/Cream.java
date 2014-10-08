package service.decorators;

import service.components.Beverage;

/**
 * Created by Deniel on 09.10.2014.
 */
public class Cream extends CondimentDecorator {

    Beverage beverage;

    public  Cream(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", cream";
    }

    @Override
    public double cost() {
        return .50 + beverage.cost();
    }
}
