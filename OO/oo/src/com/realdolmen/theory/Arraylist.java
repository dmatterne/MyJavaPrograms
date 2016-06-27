package com.realdolmen.theory;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by stannisbaratheon on 14/06/16.
 */
public class Arraylist {

    public static void main(String[] args) {
        List<String> names = new LinkedList<>();
        names.add("Jimi");
        names.add("Janice");
        names.add("Kurt");
        names.add("Jim");
        names.add("Amy");


        

        //names.remove(2);
        //names.remove("Kurt");


//        if(names.contains("Amy")) {
//
//        }

//        String[] names2 = new String[5];
//
//        names2[0] = "Jimi";
//        names2[1] = "Janice";
//        names2[2] = "Kurt";
//        names2[3] = "Jim";
//        names2[4] = "Amy";

        for (String name: names) {
            System.out.println(name);
        }

        System.out.println( 3578936%7);
    }
}
