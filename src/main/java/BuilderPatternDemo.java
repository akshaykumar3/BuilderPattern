import ComplexClass.Meal;
import ComplexClass.MealBuilder;

/**
 * Created by akshay.kumar1 on 02/12/16.
 */
public class BuilderPatternDemo {

    public static void main(String[] args) {

        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total coast = "+vegMeal.getCoast());

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("Non Veg Meal");
        nonVegMeal.showItems();
        System.out.println("Total coast = "+nonVegMeal.getCoast());
    }
}
