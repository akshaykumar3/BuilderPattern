package ComplexClass;

import MainClasses.ChickenBurger;
import MainClasses.Coke;
import MainClasses.Pepsi;
import MainClasses.VegBurger;

/**
 * Created by akshay.kumar1 on 02/12/16.
 */
public class MealBuilder {

    public Meal prepareVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
