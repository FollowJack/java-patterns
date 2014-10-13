package service.factories.ingridients;

import domain.entities.incredients.cheese.Cheese;
import domain.entities.incredients.cheese.RaggianoCheese;
import domain.entities.incredients.clam.Clam;
import domain.entities.incredients.clam.FreshClam;
import domain.entities.incredients.dough.Dough;
import domain.entities.incredients.dough.ThinCrustDough;
import domain.entities.incredients.pepperoni.Pepperoni;
import domain.entities.incredients.pepperoni.SlicedPepperoni;
import domain.entities.incredients.sauce.MarinaSauce;
import domain.entities.incredients.sauce.Sauce;
import domain.entities.incredients.veggie.Garlic;
import domain.entities.incredients.veggie.Onion;
import domain.entities.incredients.veggie.Veggies;

/**
 * Created by Deniel on 13.10.2014.
 */
public class PizzaIngredientNYFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaSauce();
    }

    @Override
    public Cheese createCheese() {
        return new RaggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[] = { new Garlic(), new Onion()};
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clam createClam() {
        return new FreshClam();
    }
}
