package domain.entities;

import java.util.Hashtable;

/**
 * Created by Deniel on 16.10.2014.
 */
public class CafeMenu implements Menu {

    Hashtable menuItems = new Hashtable();

    public CafeMenu(){
        MenuItem item = new MenuItem("BlaCafe");
        menuItems.put(item.getName(), item);
        menuItems.put(item.getName(), item);
        menuItems.put(item.getName(), item);
    }

    @Override
    public java.util.Iterator createIterator() {
        return menuItems.values().iterator();
    }


}
