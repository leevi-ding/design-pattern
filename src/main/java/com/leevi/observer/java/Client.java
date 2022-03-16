package com.leevi.observer.java;

import com.leevi.observer.java.observer.HumidityObserver;
import com.leevi.observer.java.observer.TemperatureObserver;
import com.leevi.observer.java.observer.PressureObserver;

public class Client {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        new HumidityObserver(weatherData);
        new PressureObserver(weatherData);
        new TemperatureObserver(weatherData);
        weatherData.notifyChange(0.32,12.1,21.1);
    }
}
