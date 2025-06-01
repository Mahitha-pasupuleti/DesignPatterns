package ObserverPattern.WithConstructorInjection.Observable.Wearther;

import ObserverPattern.WithConstructorInjection.Observer.DeviceTypeTemperatureObserver;

public interface WeatherStationObservable {

    public void addObserver(DeviceTypeTemperatureObserver deviceTypeTemperatureObserver);

    public void removeObserver(DeviceTypeTemperatureObserver deviceTypeTemperatureObserver);

    public void notifyDevices();

    public void setTemperature(int temperature);

}
