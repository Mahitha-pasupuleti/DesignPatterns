package AbstractFactoryPattern.Factories;

public class VehicleFactory {
    public Factory getVehicleFactory(String factoryName) {
        if ( factoryName.equals("Luxury Car") ) {
            return new LuxuryFactory();
        } else if ( factoryName.equals("Ordinary Car") ) {
            return new OrdinaryFactory();
        }
        return null;
    }
}