package DecoratorPattern.Decorator;

import DecoratorPattern.Component.BeverageComponent;

/**
 * This class represents an Almond Milk add-on for a beverage.
 *
 * [IS-A] AlmondMilkAddOnDecorator is an AddOnsDecorator,
 * which in turn is a BeverageComponent.
 *
 * [HAS-A] AlmondMilkAddOnDecorator has a reference to a BeverageComponent.
 * This enables the dynamic addition of behavior to the wrapped object.
 */
public class AlmondMilkAddOnDecorator extends AddOnsDecorator {

    // The wrapped BeverageComponent to which the add-on is applied.
    BeverageComponent beverageComponent;

    /**
     * Constructor that wraps a given BeverageComponent with Almond Milk add-on.
     *
     * @param beverageComponent the base beverage to be decorated.
     */
    public AlmondMilkAddOnDecorator(BeverageComponent beverageComponent) {
        this.beverageComponent = beverageComponent;
    }

    /**
     * Returns the name of the beverage along with the Almond Milk add-on.
     *
     * @return a string representing the beverage name with this add-on.
     */
    @Override
    public String name() {
        return this.beverageComponent.name() + " Almond Milk AddOn";
    }

    /**
     * Returns the cost of the beverage including the Almond Milk add-on.
     *
     * @return an integer representing the total cost.
     */
    @Override
    public int cost() {
        return this.beverageComponent.cost() + 3;
    }
}