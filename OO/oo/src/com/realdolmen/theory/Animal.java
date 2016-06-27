package com.realdolmen.theory;

/**
 * Created by stannisbaratheon on 03/06/16.
 */
public abstract class Animal {

    private String name;


    public Animal(String name) {
        this.name = name;
    }

    public abstract void sound() ;

}