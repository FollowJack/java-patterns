package ui.console;

import service.observable.CurrentConditionDisplay;
import service.observer.WeatherData;

/**
 * Created by Deniel on 08.10.2014.
 */
public class WeatherDataClient {

    public static void main(String[] args){

        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay currentDisplay = new CurrentConditionDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.4f);
    }
}
