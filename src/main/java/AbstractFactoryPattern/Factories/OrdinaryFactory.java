package AbstractFactoryPattern.Factories;

import AbstractFactoryPattern.Vehicles.OrdinaryVehicleV3;
import AbstractFactoryPattern.Vehicles.OrdinaryVehicleV4;
import AbstractFactoryPattern.Vehicles.Vehicle;

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
