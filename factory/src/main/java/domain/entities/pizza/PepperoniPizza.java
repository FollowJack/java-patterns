package domain.entities.pizza;

import service.factories.ingridients.PizzaIngredientFactory;

/**
 * Created by Deniel on 09.10.2014.
 */
public class PepperoniPizza extends Pizza{

    private PizzaIngredientFactory ingredientFactory;

    public PepperoniPizza(PizzaIngredientFactory ingredientFactory){
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }
}
