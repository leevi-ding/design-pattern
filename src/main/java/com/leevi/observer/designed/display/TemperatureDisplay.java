package com.leevi.observer.designed.display;

import com.leevi.observer.designed.Display;
import com.leevi.observer.designed.WeatherData;

public class TemperatureDisplay implements Display {

    private WeatherData weatherData;

    public TemperatureDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.addRegister(this);
    }

    @Override
    public void show() {
        System.out.println("temperature is "+weatherData.getTemperature());
    }
}
