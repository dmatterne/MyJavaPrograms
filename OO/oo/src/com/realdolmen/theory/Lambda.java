package com.realdolmen.theory;

import java.util.*;

/**
 * Created by stannisbaratheon on 10/06/16.
 */
public class Lambda {

    public static void main(String[] args) {

//        Comparator<String> d = new Comparator<String>() {
//
//            public int compare(String o1, String o2) {
//
//
//                return o1.compareTo(o2);
//
//
//
//            }
//        };

        //Comparator<String> d = (o1, o2) -> o1.compareTo(o2);

        String[] names = { "A","BE","CE","DE","KU","ANNA","ELSA" };

        MyStringComparator c = new MyStringComparator();

        Arrays.sort(names, c);
        System.out.println(Arrays.toString(names));


        Arrays.sort(names, (o1, o2) -> o1.compareTo(o2));
        System.out.println(Arrays.toString(names));

    }
}
