package services;

import service.GumballMachine;

/**
 * Created by Deniel on 17.10.2014.
 */
public class GumballMonitor {

    GumballMachine gumballMachine;

    public GumballMonitor(GumballMachine gumballMachine){
        this.gumballMachine = gumballMachine;
    }

    public void  report(){
        System.out.println("Gumball Machine: " + gumballMachine.getLocation());
        System.out.println("Current inventory: " + gumballMachine.getCount());
        System.out.println("Current state: " + gumballMachine.getState());
    }

}
