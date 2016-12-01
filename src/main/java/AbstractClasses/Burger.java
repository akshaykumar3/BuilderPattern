package AbstractClasses;

import ConcreateClasses.Wrapper;
import Interfaces.Item;
import Interfaces.Packing;

/**
 * Created by akshay.kumar1 on 02/12/16.
 */
public abstract class Burger implements Item {

    public Packing packing() {
        return new Wrapper();
    }

    public abstract int price();
}
