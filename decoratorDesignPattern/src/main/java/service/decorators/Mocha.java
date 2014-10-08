package service.decorators;

import service.components.Beverage;

/**
 * Created by Deniel on 09.10.2014.
 */
public class Mocha extends CondimentDecorator {

    Beverage beverage;

    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+", Mocha";
    }

    @Override
    public double cost() {
        return .80 + beverage.cost();
    }
}
