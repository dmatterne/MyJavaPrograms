package com.realdolmen.weatherforecast;

/**
 * Created by stannisbaratheon on 08/06/16.
 */
public class WeatherForecastLister {

    public static void main(String[] args) {

        for (Season s: Season.values()) {
            System.out.println(s.toString() + " Rain:" + s.percRain);
        }

    }
}
