package infrastructure.components;

import infrastructure.iterator.NullIterator;

import java.util.Iterator;

/**
 * Created by Deniel on 16.10.2014.
 */
public class MenuItem extends MenuComponent {

    String name;

    public MenuItem(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void print(){
        System.out.println(" "+getName());
    }

    @Override
    public Iterator createIterator() {
        return new NullIterator();
    }

}
