package DecoratorPattern.Component;

/**
 * This class represents a specific type of beverage: Espresso.
 * It extends the base BeverageComponent class.
 */
public class ExpressoBeverageComponent extends BeverageComponent {

    /**
     * Returns the name of the beverage.
     *
     * @return a string representing the beverage name.
     */
    @Override
    public String name() {
        return "Expresso Beverage : ";
    }

    /**
     * Returns the cost of the beverage.
     *
     * @return an integer representing the cost of the espresso beverage.
     */
    @Override
    public int cost() {
        return 7;
    }
}

