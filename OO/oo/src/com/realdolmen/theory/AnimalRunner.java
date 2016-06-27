package com.realdolmen.theory;

/**
 * Created by stannisbaratheon on 03/06/16.
 */
public class AnimalRunner {
    public static void main(String[] args) {
        //Animal crazybeast = new Animal("Pookie");
        Cat vixen = new Cat("Tom",9);
        Animal vixen2 = new Cat("Tomer",9);
        Dog fenrir = new Dog("Kiba");

        //crazybeast.sound();
        vixen.sound();
        fenrir.sound();

        Tiger tig = new Tiger ("Shere kan",9);
        tig.sound();

        produceSound(vixen);

    }

    public static void produceSound(Animal a) {
        a.sound();
    }
}
