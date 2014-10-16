package service;

import domain.entities.Menu;
import domain.entities.MenuItem;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Deniel on 16.10.2014.
 */
public class Waitress {

    List<Menu> menus;

    public Waitress(Menu menu1,Menu menu2){
        menus = new ArrayList<Menu>();
        menus.add(menu1);
        menus.add(menu2);
    }

    public void printMenu(){
        for( Menu menu : menus){
            Iterator menuIterator = menu.createIterator();
            System.out.println("MENU\n-----\nBREAKFAST");
            printMenu(menuIterator);
        }
    }

    private void printMenu(Iterator iterator) {
        while(iterator.hasNext()){
            MenuItem menuItem = (MenuItem)iterator.next();
            System.out.println(menuItem.getName());
        }
    }
}
