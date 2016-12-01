package AbstractClasses;

import ConcreateClasses.Bottle;
import Interfaces.Item;
import Interfaces.Packing;

/**
 * Created by akshay.kumar1 on 02/12/16.
 */
public abstract class ColdDrink implements Item{

    public Packing packing() {
        return new Bottle();
    }

    public abstract int price();
}
