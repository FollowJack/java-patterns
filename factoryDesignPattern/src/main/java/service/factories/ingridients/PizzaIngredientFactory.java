package service.factories.ingridients;

import domain.entities.incredients.cheese.Cheese;
import domain.entities.incredients.clam.Clam;
import domain.entities.incredients.dough.Dough;
import domain.entities.incredients.pepperoni.Pepperoni;
import domain.entities.incredients.sauce.Sauce;
import domain.entities.incredients.veggie.Veggies;

/**
 * Created by Deniel on 13.10.2014.
 */
public interface PizzaIngredientFactory {

    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Pepperoni createPepperoni();
    public Clam createClam();

}
