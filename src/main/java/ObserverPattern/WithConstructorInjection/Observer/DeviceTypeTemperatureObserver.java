package ObserverPattern.WithConstructorInjection.Observer;

public interface DeviceTypeTemperatureObserver {

    public void update(int temperature);

    /*

    THIS VIOLATES INTERFACE SEGREGATION PRINCIPLE
    Definition: “Clients should not be forced to depend upon interfaces that they do not use.”
    public void update(int temperature);
    public void update(String breakingNews);

     */
}
