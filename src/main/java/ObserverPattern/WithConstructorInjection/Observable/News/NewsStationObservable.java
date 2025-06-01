package ObserverPattern.WithConstructorInjection.Observable.News;

import ObserverPattern.WithConstructorInjection.Observer.DeviceTypeNewsObserver;

public interface NewsStationObservable {

    public void addObserver(DeviceTypeNewsObserver deviceTypeNewsObserver);

    public void removeObserver(DeviceTypeNewsObserver deviceTypeNewsObserver);

    public void notifyDevices();

    public void setBreakingNews(String breakingNews);

}
