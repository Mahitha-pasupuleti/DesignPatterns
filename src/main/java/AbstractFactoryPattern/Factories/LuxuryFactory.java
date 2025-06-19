package AbstractFactoryPattern.Factories;

import AbstractFactoryPattern.Vehicles.LuxuryVehicleV1;
import AbstractFactoryPattern.Vehicles.LuxuryVehicleV2;
import AbstractFactoryPattern.Vehicles.Vehicle;

public class LuxuryFactory implements Factory{
    public Vehicle getVehicle(String carName) {
        if ( carName.equals("BMW") ) {
            return new LuxuryVehicleV1();
        } else if ( carName.equals("Mercedes") ) {
            return new LuxuryVehicleV2();
        }
        return null;
    }
}
