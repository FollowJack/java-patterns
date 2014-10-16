package ui.console;

import domain.entities.CaffeineBeverage;
import domain.entities.Coffee;
import domain.entities.Tea;

/**
 * Created by Deniel on 15.10.2014.
 */
public class BeverageClient {

    public static void main(String[] args){
        CaffeineBeverage tea = new Tea();
        tea.prepareRecipe();

        CaffeineBeverage coffee = new Coffee();
        coffee.prepareRecipe();
    }
}
