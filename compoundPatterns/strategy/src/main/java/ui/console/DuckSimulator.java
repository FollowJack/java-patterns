package ui.console;

import domain.behaviours.Flock;
import domain.behaviours.IQuackable;
import domain.entities.Goose;
import infrastructure.adapters.GooseAdapter;
import infrastructure.dcorators.QuackCounter;
import infrastructure.factories.AbstractDuckFactory;
import infrastructure.factories.CountingDuckFactory;
import infrastructure.observers.Quackologist;

/**
 * Created by Deniel on 18.10.2014.
 */
public class DuckSimulator {

    public static void main(String[] args){

        DuckSimulator simulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();
        simulator.simulate(duckFactory);

    }

    private void simulate(AbstractDuckFactory duckFactory) {
        IQuackable mallardDuck = duckFactory.createMallardDuck();
        IQuackable redHeadDuck = duckFactory.createRedheadDuck();
        IQuackable duckCall = duckFactory.createDuckCall();
        IQuackable rubberDuck = duckFactory.createRubberDuck();
        IQuackable gooseDuck = new GooseAdapter(new Goose());

        Flock flockOfDucks = new Flock();
        flockOfDucks.add(redHeadDuck);
        flockOfDucks.add(duckCall);
        flockOfDucks.add(rubberDuck);
        flockOfDucks.add(gooseDuck);

        Flock flockOfMallards = new Flock();

        IQuackable mallardOne = duckFactory.createMallardDuck();
        IQuackable mallardTwo = duckFactory.createMallardDuck();
        IQuackable mallardThree = duckFactory.createMallardDuck();
        IQuackable mallardFour = duckFactory.createMallardDuck();

        flockOfMallards.add(mallardOne);
        flockOfMallards.add(mallardTwo);
        flockOfMallards.add(mallardThree);
        flockOfMallards.add(mallardFour);

        flockOfDucks.add(flockOfMallards);

        System.out.println("\nDuck Simulator");

        simulate(mallardDuck);
        simulate(redHeadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(gooseDuck);

        System.out.println("\nDuck Simulator: With Observer");
        Quackologist quackologist = new Quackologist();
        flockOfDucks.registerObserver(quackologist);

        System.out.println("\nDuck simulator: Whole Flock Simulation");
        simulate(flockOfDucks);

        System.out.println("\nDuck simulator: Mallard Flock Simulation");
        simulate(flockOfMallards);

        System.out.println("The ducks quacked " + QuackCounter.getQuacks()+" times.");
    }

    private void simulate(IQuackable duck) {
        duck.quack();
    }

}
