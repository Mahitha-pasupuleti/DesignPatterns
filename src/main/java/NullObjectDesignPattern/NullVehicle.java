package NullObjectDesignPattern;

public class NullVehicle implements VehicleType {
    @Override
    public void vehicleDetails() {
        System.out.println("This is not a vehicle");
    }
}
