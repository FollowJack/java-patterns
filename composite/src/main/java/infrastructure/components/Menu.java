package infrastructure.components;

import infrastructure.iterator.CompositeIterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Deniel on 16.10.2014.
 */
public class Menu extends MenuComponent {

    ArrayList menuComponents = new ArrayList();
    String name;

    public Menu(String name){
        this.name = name;
    }

    public void add(MenuComponent menuComponent){
        menuComponents.add(menuComponent);
    }

    public void remove(MenuComponent menuComponent){
        menuComponents.remove(menuComponent);
    }
    public MenuComponent getChild(int i){
        return (MenuComponent)menuComponents.get(i);
    }

    public String getName(){
        return name;
    }

    public void print(){
        System.out.println("\n"+ getName());
        System.out.println("------------------");

        for(Object component : menuComponents){
            MenuComponent menuComponent = (MenuComponent)component;
            menuComponent.print();
        }
    }

    @Override
    public Iterator createIterator() {
        return new CompositeIterator(menuComponents.iterator());
    }
}
