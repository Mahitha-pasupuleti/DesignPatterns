package NullObjectDesignPattern;

public class Car implements VehicleType {
    @Override
    public void vehicleDetails() {
        System.out.println("I am a large size car");
    }
}
