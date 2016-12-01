package ComplexClass;

import Interfaces.Item;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by akshay.kumar1 on 02/12/16.
 */
public class Meal {

    public List<Item> items = new ArrayList<Item>();

    public void addItem(Item item) {
        items.add(item);
    }

    public int getCoast() {
        int coast = 0;
        for (Item item : items) {
            coast += item.price();
        }
        return coast;
    }

    public void showItems() {
        for (Item item : items) {
            System.out.print("Item name = "+item.name());
            System.out.print(", Item coast = "+item.price());
            System.out.println(", Item packing = "+item.packing().pack());
        }
    }
}
