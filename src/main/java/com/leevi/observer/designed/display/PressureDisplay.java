package com.leevi.observer.designed.display;

import com.leevi.observer.designed.Display;
import com.leevi.observer.designed.WeatherData;

public class PressureDisplay implements Display {

    private WeatherData weatherData;

    public PressureDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.addRegister(this);
    }

    @Override
    public void show() {
        System.out.println("pressure is "+weatherData.getPressure());
    }
}
