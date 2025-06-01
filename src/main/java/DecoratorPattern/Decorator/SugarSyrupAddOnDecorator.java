package DecoratorPattern.Decorator;

import DecoratorPattern.Component.BeverageComponent;

/**
 * This class represents a Sugar Syrup add-on for a beverage.
 *
 * [IS-A] SugarSyrupAddOnDecorator is an AddOnsDecorator,
 * which in turn is a BeverageComponent.
 *
 * [HAS-A] SugarSyrupAddOnDecorator has a reference to a BeverageComponent.
 * This enables it to decorate the base beverage with sugar syrup.
 */
public class SugarSyrupAddOnDecorator extends AddOnsDecorator {

    // Reference to the beverage component being decorated.
    BeverageComponent beverageComponent;

    /**
     * Constructor that wraps a given BeverageComponent with Sugar Syrup add-on.
     *
     * @param beverageComponent the base beverage to be decorated.
     */
    public SugarSyrupAddOnDecorator(BeverageComponent beverageComponent) {
        this.beverageComponent = beverageComponent;
    }

    /**
     * Returns the name of the beverage along with the Sugar Syrup add-on.
     *
     * @return a string representing the beverage name with this add-on.
     */
    @Override
    public String name() {
        return this.beverageComponent.name() + " Sugar Syrup AddOn";
    }

    /**
     * Returns the cost of the beverage including the Sugar Syrup add-on.
     *
     * @return an integer representing the total cost.
     */
    @Override
    public int cost() {
        return this.beverageComponent.cost() + 1;
    }
}
