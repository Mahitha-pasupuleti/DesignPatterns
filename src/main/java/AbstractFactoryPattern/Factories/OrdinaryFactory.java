package AbstractFactoryPattern.Factories;

import AbstractFactoryPattern.Factories.Vehicles.OrdinaryVehicleV3;
import AbstractFactoryPattern.Factories.Vehicles.OrdinaryVehicleV4;
import AbstractFactoryPattern.Factories.Vehicles.Vehicle;

public class OrdinaryFactory implements Factory {
    public Vehicle getVehicle(String carName) {
        if ( carName.equals("Swift") ) {
            return new OrdinaryVehicleV3();
        } else if ( carName.equals("Hyndai") ) {
            return new OrdinaryVehicleV4();
        }
        return null;
    }
}
