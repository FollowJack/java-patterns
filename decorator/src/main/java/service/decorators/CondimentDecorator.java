package service.decorators;

import service.components.Beverage;

/**
 * Created by Deniel on 09.10.2014.
 */
public abstract class CondimentDecorator extends Beverage{
    public abstract String getDescription();
}
