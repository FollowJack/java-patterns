package domain.entities;

import service.GumballMachine;

/**
 * Created by Deniel on 16.10.2014.
 */
public class SoldOutState implements IState{

        GumballMachine gumballMachine;

        public SoldOutState (GumballMachine gumballMachine){
            this.gumballMachine = gumballMachine;
        }

        @Override
        public void insertQuarter() {
            System.out.println("Sorry, no gumballs available.");
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
            System.out.println("Sorry no gumballs available.");
        }
    }

