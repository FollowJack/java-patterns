package ui.console;

import domain.entities.duck.IDuck;
import domain.entities.duck.MallardDuck;
import domain.entities.turkey.ITurkey;
import domain.entities.turkey.TurkeyAdapter;
import domain.entities.turkey.WildTurkey;

/**
 * Created by Deniel on 15.10.2014.
 */
public class AdapterClient {

    public static void main(String[] args){

        IDuck duck = new MallardDuck();

        duck.quack();
        duck.fly();

        ITurkey turkey = new WildTurkey();
        turkey.gobble();
        turkey.fly();

        TurkeyAdapter adapter = new TurkeyAdapter(turkey);
        adapter.quack();
        adapter.fly();

    }
}
