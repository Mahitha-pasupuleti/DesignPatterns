package ObserverPattern.WithConstructorInjection.Observable.Wearther;

import ObserverPattern.WithConstructorInjection.Observer.DeviceTypeTemperatureObserver;

import java.util.ArrayList;
import java.util.List;

public class WeatherStationObservableImpl implements WeatherStationObservable {

    // Current temperature recorded by the weather station
    int temperature;

    // List to keep track of all devices (observers) that want weather updates
    List<DeviceTypeTemperatureObserver> devices = new ArrayList<>();

    // Add a new device (observer) to the list
    @Override
    public void addObserver(DeviceTypeTemperatureObserver deviceTypeTemperatureObserver) {
        devices.add(deviceTypeTemperatureObserver);
        System.out.println("New device type connected to follow Weather...");
    }

    // Remove a device (observer) from the list
    @Override
    public void removeObserver(DeviceTypeTemperatureObserver deviceTypeTemperatureObserver) {
        devices.remove(deviceTypeTemperatureObserver);
    }

    // Notify all registered devices about the current temperature update
    @Override
    public void notifyDevices() {
        for (DeviceTypeTemperatureObserver device : devices) {
            device.update(temperature);  // Call update method on each device with new temperature
        }
    }

    // Get the current temperature
    public int getTemperature() {
        return temperature;
    }

    // Set a new temperature and notify all devices about the change
    public void setTemperature(int temperature) {
        this.temperature = temperature;
        notifyDevices();  // Inform all observers of the updated temperature
    }
}
