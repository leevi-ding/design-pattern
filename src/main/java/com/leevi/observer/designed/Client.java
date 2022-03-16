package com.leevi.observer.designed;

import com.leevi.observer.designed.display.HumidityDisplay;
import com.leevi.observer.designed.display.PressureDisplay;
import com.leevi.observer.designed.display.TemperatureDisplay;

public class Client {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        new HumidityDisplay(weatherData);
        new TemperatureDisplay(weatherData);
        new PressureDisplay(weatherData);
        weatherData.change(0.37,1.33,18.2);
    }
}
