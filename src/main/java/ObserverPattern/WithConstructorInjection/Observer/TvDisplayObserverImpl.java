package ObserverPattern.WithConstructorInjection.Observer;

import ObserverPattern.WithConstructorInjection.Observable.News.NewsStationObservable;
import ObserverPattern.WithConstructorInjection.Observable.Wearther.WeatherStationObservable;

// This class implements an observer that listens for both temperature and news updates
// It acts as a TV display showing weather and news data
public class TvDisplayObserverImpl implements DeviceTypeTemperatureObserver, DeviceTypeNewsObserver {

    // References to observables for weather and news
    WeatherStationObservable weatherStationObservable;
    NewsStationObservable newsStationObservable;

    // Constructor injects both weather and news observables this observer listens to
    public TvDisplayObserverImpl(WeatherStationObservable weatherStationObservable, NewsStationObservable newsStationObservable) {
        this.weatherStationObservable = weatherStationObservable;
        this.newsStationObservable = newsStationObservable;
    }

    // Called when there is a temperature update
    @Override
    public void update(int temperature) {
        // Display updated weather info on the TV (simulated via console)
        System.out.println("Data being displayed in Mobile...");
        System.out.println("Weather has changed. Current temperature is " + temperature);
    }

    // Called when there is breaking news update
    @Override
    public void update(String breakingNews) {
        // Display updated news info on the TV (simulated via console)
        System.out.println("Data being displayed in Mobile...");
        System.out.println("Latest Breaking News " + breakingNews);
    }
}