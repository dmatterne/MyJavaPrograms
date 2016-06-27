package com.realdolmen.trafficlight;

/**
 * Created by stannisbaratheon on 08/06/16.
 */
public enum TrafficLight {
    RED(10),
    GREEN(5),
    YELLOW(1);

    public final double duration;

    private TrafficLight(double duration){
        this.duration = duration;
    }
}
