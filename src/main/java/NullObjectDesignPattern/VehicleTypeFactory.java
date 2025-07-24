package NullObjectDesignPattern;

public class VehicleTypeFactory {
    public VehicleType getVehicle(String vehicleType) {
        if ( vehicleType.equals("Car") ) return new Car();
        else if ( vehicleType.equals("Bike") ) return new Bike();
        else if ( vehicleType.equals("Truck") ) return new Truck();

        return new NullVehicle();
    }
}
