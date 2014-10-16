package ui.console;

import service.components.Beverage;
import service.components.DarkRoast;
import service.decorators.Cream;
import service.decorators.Mocha;

/**
 * Created by Deniel on 09.10.2014.
 */
public class StarbuzzClient {

    public static void main(String[] args){

        Beverage beverage = new DarkRoast();
        beverage = new Mocha(beverage);
        beverage = new Mocha(beverage);
        beverage = new Cream(beverage);
        System.out.println(beverage.getDescription()+" $"+beverage.cost());

    }

}
