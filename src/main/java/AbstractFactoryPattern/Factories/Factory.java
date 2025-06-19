package AbstractFactoryPattern.Factories;

import AbstractFactoryPattern.Vehicles.Vehicle;

public interface Factory {
    public Vehicle getVehicle(String value);
}
