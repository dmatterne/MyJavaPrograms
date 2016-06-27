package com.realdolmen.theory;

/**
 * Created by stannisbaratheon on 09/06/16.
 */
 interface  Shape {
      double surface();
      double perimiter();


    //als ze geen default klasse voorzien, dan word deze print gebruikt, indien default niet gespecifieerd =
    // moet toegevoegd worden aan alle klassen
     default void print() {
        System.out.println(perimiter());
        System.out.println(surface());
    }
}
