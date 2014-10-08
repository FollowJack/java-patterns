package service.observable;

/**
 * Created by Deniel on 08.10.2014.
 */
public interface IObserver {

    public void update(float temperature, float humidity, float pressure);
}
