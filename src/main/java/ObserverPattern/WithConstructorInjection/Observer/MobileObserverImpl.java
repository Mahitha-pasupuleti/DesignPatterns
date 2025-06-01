package ObserverPattern.WithConstructorInjection.Observer;

import ObserverPattern.WithConstructorInjection.Observable.Wearther.WeatherStationObservable;

// This class implements a mobile device observer for temperature updates
public class MobileObserverImpl implements DeviceTypeTemperatureObserver {

    // Reference to the weather station observable that this observer listens to
    WeatherStationObservable weatherStationObservable;

    // Constructor to inject the observable this observer subscribes to
    public MobileObserverImpl(WeatherStationObservable weatherStationObservable) {
        this.weatherStationObservable = weatherStationObservable;
    }

    // This method is called when the observable pushes an update with new temperature data
    @Override
    public void update(int temperature) {
        // Simulate displaying updated weather data on the mobile device (console output)
        System.out.println("Data being displayed in TV...");
        System.out.println("Weather has changed. Current temperature is " + temperature);
    }
}

/*

| Model          | How it works                                                                                                                 | Your case            |
| -------------- | ---------------------------------------------------------------------------------------------------------------------------- | -------------------- |
| **Push** model | Observable *pushes* the updated data to observers via `update(data)`                                                         | ✅ You're using this  |
| **Pull** model | Observable only notifies observers (`update()`), and they then *pull* data themselves using a getter like `getTemperature()` | ❌ Adds more coupling |

Explanation:
- In your code, the observable directly sends the new temperature value to observers when it changes. This is the **push** model.
- The **pull** model would notify observers that something changed but not send data, so observers must ask the observable for updated data themselves, which can cause tighter coupling and extra calls.

*/
