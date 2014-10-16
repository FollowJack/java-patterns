package service.waitress;

import infrastructure.components.MenuComponent;

/**
 * Created by Deniel on 16.10.2014.
 */
public class Waitress {

    MenuComponent allMenus;

    public Waitress(MenuComponent allMenus){
        this.allMenus = allMenus;
    }

    public void printMenu(){
        allMenus.print();
    }

}
