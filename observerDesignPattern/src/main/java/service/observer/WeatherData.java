package service.observer;

import service.observable.IObserver;

import java.util.ArrayList;

/**
 * Created by Deniel on 08.10.2014.
 */
public class WeatherData implements ISubject {

    private ArrayList observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData(){
        observers = new ArrayList();
    }

    @Override
    public void removeObserver(IObserver observer) {
        int i = observers.indexOf(observer);
        if(i >= 0)
            observers.remove(i);
    }

    @Override
    public void registerObserver(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++){
            IObserver observer = (IObserver) observers.get(i);
            observer.update(temperature,humidity,pressure);
        }
    }

    public void measurementChanged(){
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementChanged();
    }
}
