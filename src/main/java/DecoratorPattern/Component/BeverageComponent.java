package DecoratorPattern.Component;

/**
 * This is the base class for all beverages.
 * Other drinks like coffee or tea will extend this.
 */
public abstract class BeverageComponent {

    /**
     * Returns the name of the drink.
     */
    public abstract String name();

    /**
     * Returns the cost of the drink.
     */
    public abstract int cost();
}

