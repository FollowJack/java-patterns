package ui.console;

import service.GumballMachine;

/**
 * Created by Deniel on 17.10.2014.
 */
public class GumballMachineClient {

    public static void main(String[] args){

        GumballMachine gumballMachine = new GumballMachine("Bla",5);

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);

    }

}
