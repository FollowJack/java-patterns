package domain.entities;

import service.GumballMachine;

/**
 * Created by Deniel on 17.10.2014.
 */
public class WinnerState implements IState {

    private GumballMachine gumballMachine;

    public WinnerState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Please wait, we're already giving you a gumball.");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Sorry, you already turned the crank.");
    }

    @Override
    public void turnCrank() {
        System.out.println("Turned twice doesn't get you another gumball.");
    }

    @Override
    public void dispense() {
        System.out.println("YOU'RE A WINNER! You get two gumballs for your quarter.");

        gumballMachine.releaseBall();

        if(gumballMachine.getCount() == 0)
            gumballMachine.setState(gumballMachine.getSoldOutState());
        else{
            gumballMachine.releaseBall();

            if(gumballMachine.getCount() > 0)
                gumballMachine.setState(gumballMachine.getNoQuarterState());
            else{
                System.out.println("Oops, out of gumballs!");
                gumballMachine.setState(gumballMachine.getSoldOutState());
            }
        }

    }
}
