package DecoratorPattern.Component;

/**
 * This class represents a specific type of beverage: Cafe Latte.
 * It extends the base BeverageComponent class.
 */
public class CafeLatteBeverageComponent extends BeverageComponent {

    /**
     * Returns the name of the beverage.
     */
    @Override
    public String name() {
        return "Cafe Latte Beverage : ";
    }

    /**
     * Returns the cost of the beverage.
     */
    @Override
    public int cost() {
        return 8;
    }
}


