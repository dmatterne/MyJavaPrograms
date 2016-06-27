package com.realdolmen.weatherforecast;

/**
 * Created by stannisbaratheon on 08/06/16.
 */
public enum Season {
    WINTER(50,75,10),SPRING(20,10,70),SUMMER(10,5,80),FALL(80,30,5);

    public final int percRain;
    public final int percSnow;
    public final int percSunsh;

    private Season(int percRain,int percSnow, int percSunsh) {
        this.percRain=percRain;
        this.percSnow=percSnow;
        this.percSunsh=percSunsh;
    }
}
