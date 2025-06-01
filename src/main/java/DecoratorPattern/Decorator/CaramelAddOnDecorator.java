package DecoratorPattern.Decorator;

import DecoratorPattern.Component.BeverageComponent;

/**
 * This class represents a Caramel add-on for a beverage.
 *
 * [IS-A] CaramelAddOnDecorator is an AddOnsDecorator,
 * which in turn is a BeverageComponent.
 *
 * [HAS-A] CaramelAddOnDecorator has a reference to a BeverageComponent.
 * This allows it to wrap the original beverage and add caramel flavor to it.
 */
public class CaramelAddOnDecorator extends AddOnsDecorator {

    // Reference to the original beverage component being decorated.
    BeverageComponent beverageComponent;

    /**
     * Constructor that wraps a given BeverageComponent with Caramel add-on.
     *
     * @param beverageComponent the base beverage to be decorated.
     */
    public CaramelAddOnDecorator(BeverageComponent beverageComponent) {
        this.beverageComponent = beverageComponent;
    }

    /**
     * Returns the name of the beverage along with the Caramel add-on.
     *
     * @return a string representing the beverage name with this add-on.
     */
    @Override
    public String name() {
        return this.beverageComponent.name() + " Caramel AddOn";
    }

    /**
     * Returns the cost of the beverage including the Caramel add-on.
     *
     * @return an integer representing the total cost.
     */
    @Override
    public int cost() {
        return this.beverageComponent.cost() + 2;
    }
}
