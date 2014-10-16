package domain.entities;

import infrastructure.iterator.DinerMenuIterator;

/**
 * Created by Deniel on 15.10.2014.
 */
public class DinerMenu implements Menu{
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinerMenu(){
        this.menuItems = new MenuItem[MAX_ITEMS];

        menuItems[0] = new MenuItem("Food");
        menuItems[1] = new MenuItem("Bla");
        menuItems[5] = new MenuItem("Beverage");
    }

    public java.util.Iterator createIterator(){
        return new DinerMenuIterator(menuItems);
    }
}
