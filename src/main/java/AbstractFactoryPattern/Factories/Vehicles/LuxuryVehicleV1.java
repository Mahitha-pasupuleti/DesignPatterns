package AbstractFactoryPattern.Factories.Vehicles;

public class LuxuryVehicleV1 implements Vehicle {
    @Override
    public void vehicleName() {
        System.out.println("I am BMW");
    }
}
