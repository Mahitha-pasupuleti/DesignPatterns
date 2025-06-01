package DecoratorPattern.Decorator;

import DecoratorPattern.Component.BeverageComponent;

/**
 * Abstract class representing a decorator for beverage add-ons.
 *
 * [IS-A] relationship: AddOnsDecorator is a type of BeverageComponent.
 * This allows it to be used interchangeably with other BeverageComponents.
 */
public abstract class AddOnsDecorator extends BeverageComponent {

    /**
     * Returns the name of the beverage including its add-on description.
     *
     * @return a string representing the name of the beverage with add-ons.
     */
    public abstract String name();

    /**
     * Returns the total cost of the beverage including the cost of add-ons.
     *
     * @return an integer representing the total cost.
     */
    public abstract int cost();
}
