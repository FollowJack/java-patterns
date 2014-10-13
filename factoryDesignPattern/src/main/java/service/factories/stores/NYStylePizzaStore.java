package service.factories.stores;

import domain.entities.pizza.*;
import service.factories.ingridients.PizzaIngredientNYFactory;
import service.factories.ingridients.PizzaIngredientFactory;

/**
 * Created by Deniel on 11.10.2014.
 */
public class NYStylePizzaStore extends PizzaStore {


    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;

        PizzaIngredientFactory ingredientFactory = new PizzaIngredientNYFactory();


        if(type.equals("cheese")){
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        }
        else if(type.equals("pepperoni")){
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("New York Style Pepperoni Pizza");
        }
        else if(type.equals("clam")){
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("New York Style Clam Pizza");
        }

        return pizza;
    }

}
