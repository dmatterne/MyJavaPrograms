package com.realdolmen.theory;

/**
 * Created by stannisbaratheon on 03/06/16.
 */
public class Bee {

    public static int numberOfBeesInTheWorld=0;

    private String name;

    public Bee(String name) {
        this();
        this.name = name;
    }

    public Bee() {
        numberOfBeesInTheWorld++;
    }

    public static int getNumberOfBeesInTheWorld() {
        return numberOfBeesInTheWorld;
    }

    public static void setNumberOfBeesInTheWorld(int numberOfBeesInTheWorld) {
        Bee.numberOfBeesInTheWorld = numberOfBeesInTheWorld;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void fly() {
        System.out.println("Bee " + name  + " is flying.");
    }

}
