package ui.console;

import service.GumballMachine;
import services.GumballMonitor;

/**
 * Created by Deniel on 17.10.2014.
 */
public class GumballMachineMonitorClient {

    public static void main(String[] args){

        int count = 0;

        args = new String[2];
        args[0] = "Seattle";
        args[1] = "112";

        if(args.length < 2){
            System.out.println("GumballMachine <name> <inventory>");
            System.exit(1);
        }

        count = Integer.parseInt(args[1]);
        GumballMachine gumballMachine = new GumballMachine(args[0], count);

        GumballMonitor gumballMonitor = new GumballMonitor(gumballMachine);

        gumballMonitor.report();

    }


}
