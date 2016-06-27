package com.realdolmen.fan;

/**
 * Created by stannisbaratheon on 10/06/16.
 */
public class Fan {

    private int speed = Speed.SLOW.value;
    private boolean on = false;
    private double radius = 5.0;
    private String color = "blue";


    public Fan() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Fan fan = (Fan) o;

        if (speed != fan.speed) return false;
        if (on != fan.on) return false;
        if (Double.compare(fan.radius, radius) != 0) return false;
        return color != null ? color.equals(fan.color) : fan.color == null;

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = speed;
        result = 31 * result + (on ? 1 : 0);
        temp = Double.doubleToLongBits(radius);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (color != null ? color.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {


        if (on) {
            return "ON Fan{" +
                    "speed=" + speed +
                    ", on=" + on +
                    ", radius=" + radius +
                    ", color='" + color + '\'' +
                    '}';
        } else {
            return "OFF Fan{" +
                    "speed=" + speed +
                    ", on=" + on +
                    ", radius=" + radius +
                    ", color='" + color + '\'' +
                    '}';
        }

    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
