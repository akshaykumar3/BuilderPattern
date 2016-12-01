package MainClasses;

import AbstractClasses.Burger;

/**
 * Created by akshay.kumar1 on 02/12/16.
 */
public class VegBurger extends Burger {

    public int price() {
        return 50;
    }

    public String name() {
        return "Veg Burger";
    }
}
