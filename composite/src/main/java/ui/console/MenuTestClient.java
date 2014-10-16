package ui.console;

import infrastructure.components.Menu;
import infrastructure.components.MenuComponent;
import infrastructure.components.MenuItem;
import service.waitress.Waitress;

/**
 * Created by Deniel on 16.10.2014.
 */
public class MenuTestClient {

    public static void main(String[] args){

        MenuComponent dinerMenu = new Menu("Diner Menu");
        MenuComponent cafeMenu = new Menu("Cafe Menu");
        MenuComponent dessertMenu = new MenuItem("Dessert Menu");

        MenuComponent allMenus = new Menu("All Menus");

        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);

        cafeMenu.add(dessertMenu);

        Waitress waitress = new Waitress(allMenus);

        waitress.printMenu();

    }

}
