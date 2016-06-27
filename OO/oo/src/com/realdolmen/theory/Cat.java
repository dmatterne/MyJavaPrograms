package com.realdolmen.theory;

/**
 * Created by stannisbaratheon on 03/06/16.
 */
public class Cat extends Animal {

    private int lives;

    public Cat(String name, int lives) {
        super(name);
        this.lives = lives;
    }

    public void sound() {
        System.out.println("Meoooow");

    }

}
