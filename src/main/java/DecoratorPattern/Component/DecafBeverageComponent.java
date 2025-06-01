package DecoratorPattern.Component;

/**
 * This class represents a specific type of beverage: Decaf.
 * It extends the base BeverageComponent class.
 */
public class DecafBeverageComponent extends BeverageComponent {

    /**
     * Returns the name of the beverage.
     *
     * @return a string representing the beverage name.
     */
    @Override
    public String name() {
        return "Decaf Beverage : ";
    }

    /**
     * Returns the cost of the beverage.
     *
     * @return an integer representing the cost of the decaf beverage.
     */
    @Override
    public int cost() {
        return 5;
    }
}