package NullObjectDesignPattern;

public class Bike implements VehicleType {

    @Override
    public void vehicleDetails() {
        System.out.println("I am a very awesome and fast bike");
    }
}
