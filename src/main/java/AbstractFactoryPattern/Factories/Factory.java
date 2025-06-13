package AbstractFactoryPattern.Factories;

import AbstractFactoryPattern.Factories.Vehicles.Vehicle;

public interface Factory {
    public Vehicle getVehicle(String value);
}
