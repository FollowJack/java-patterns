package ui.console;

import service.factories.stores.NYStylePizzaStore;
import service.factories.stores.PizzaStore;

/**
 * Created by Deniel on 11.10.2014.
 */
public class PizzaStoreClient {

    public static void main(String[] args){

        PizzaStore store = new NYStylePizzaStore();

        store.orderPizza("pepperoni");

    }

}
