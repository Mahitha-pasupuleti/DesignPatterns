package ObserverPattern.WithConstructorInjection.Observable.News;

import ObserverPattern.WithConstructorInjection.Observer.DeviceTypeNewsObserver;
import ObserverPattern.WithConstructorInjection.Observer.DeviceTypeTemperatureObserver;

import java.util.ArrayList;
import java.util.List;

public class NewsStationObservableImpl implements NewsStationObservable {

    // Current breaking news headline
    String breakingNews;

    // List of devices (observers) that want to receive news updates
    List<DeviceTypeNewsObserver> devices = new ArrayList<>();

    // Add a new device (observer) to the list
    @Override
    public void addObserver(DeviceTypeNewsObserver deviceTypeNewsObserver) {
        devices.add(deviceTypeNewsObserver);
        System.out.println("New device type connected to follow News...");
    }

    // Remove a device (observer) from the list
    @Override
    public void removeObserver(DeviceTypeNewsObserver deviceTypeNewsObserver) {
        devices.remove(deviceTypeNewsObserver);
    }

    // Notify all registered devices with the current breaking news
    @Override
    public void notifyDevices() {
        for (DeviceTypeNewsObserver device : devices) {
            device.update(breakingNews);  // Call update on each observer with breaking news
        }
    }

    // Update the breaking news and notify all observers about the change
    @Override
    public void setBreakingNews(String breakingNews) {
        this.breakingNews = breakingNews;
        notifyDevices();  // Inform all observers of the new breaking news
    }
}