package DecoratorPattern.Decorator;

import DecoratorPattern.Component.BeverageComponent;

/**
 * This class represents a Chocolate add-on for a beverage.
 *
 * [IS-A] ChocolateAddOnDecorator is an AddOnsDecorator,
 * which in turn is a BeverageComponent.
 *
 * [HAS-A] ChocolateAddOnDecorator has a reference to a BeverageComponent.
 * This allows it to enhance the original beverage with chocolate flavor.
 */
public class ChocolateAddOnDecorator extends AddOnsDecorator {

    // Reference to the beverage component being decorated.
    BeverageComponent beverageComponent;

    /**
     * Constructor that wraps a given BeverageComponent with Chocolate add-on.
     *
     * @param beverageComponent the base beverage to be decorated.
     */
    public ChocolateAddOnDecorator(BeverageComponent beverageComponent) {
        this.beverageComponent = beverageComponent;
    }

    /**
     * Returns the name of the beverage along with the Chocolate add-on.
     *
     * @return a string representing the beverage name with this add-on.
     */
    @Override
    public String name() {
        return this.beverageComponent.name() + " Chocolate AddOn";
    }

    /**
     * Returns the cost of the beverage including the Chocolate add-on.
     *
     * @return an integer representing the total cost.
     */
    @Override
    public int cost() {
        return this.beverageComponent.cost() + 2;
    }
}
