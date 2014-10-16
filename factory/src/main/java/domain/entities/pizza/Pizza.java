package domain.entities.pizza;

import domain.entities.incredients.cheese.Cheese;
import domain.entities.incredients.clam.Clam;
import domain.entities.incredients.dough.Dough;
import domain.entities.incredients.pepperoni.Pepperoni;
import domain.entities.incredients.sauce.Sauce;
import domain.entities.incredients.veggie.Veggies;

/**
 * Created by Deniel on 09.10.2014.
 */
public abstract class Pizza {

    String name;
    Dough dough;
    Sauce sauce;
    Veggies veggies[];
    Cheese cheese;
    Pepperoni pepperoni;
    Clam clam;

    public abstract void prepare();
//    {
//        System.out.println("Preparing " +name+".");
//        System.out.println("Tossing dough ...");
//        System.out.println("Adding sauce...");
//        System.out.println("Adding toppings: ");
//
//        for (int i = 0; i < toppings.size() ; i++) {
//            System.out.println(" " +toppings.get(i));
//        }
//    }
    public void bake(){
        System.out.println("Bake Pizza.");
    }
    public void cut(){
        System.out.println("Cut Pizza.");
    }
    public void box(){
        System.out.println("Box Pizza.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
