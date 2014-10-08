package service.observable;


import service.observer.ISubject;

/**
 * Created by Deniel on 08.10.2014.
 */
public class CurrentConditionDisplay implements IObserver,IDisplayElement {

    private float temperature;
    private float humidity;
    private ISubject weatherData;

    public CurrentConditionDisplay(ISubject weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: "+temperature+" C degrees and "+humidity+" %humidity.");
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }
}
