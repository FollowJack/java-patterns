package ui.console;

import domain.entities.CafeMenu;
import domain.entities.DinerMenu;
import service.Waitress;

/**
 * Created by Deniel on 16.10.2014.
 */
public class WaitressClient {

    public static void main(String[] args){

        DinerMenu dinerMenu = new DinerMenu();
        CafeMenu cafeMenu = new CafeMenu();
        Waitress waitress = new Waitress(dinerMenu,cafeMenu);

        waitress.printMenu();

    }


}
