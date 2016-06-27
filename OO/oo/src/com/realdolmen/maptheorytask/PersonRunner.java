package com.realdolmen.maptheorytask;

import java.util.TreeSet;
import java.util.function.Predicate;

/**
 * Created by stannisbaratheon on 14/06/16.
 */
public class PersonRunner {

    public static void main(String[] args) {

        TreeSet<Person> persons = new TreeSet<>();

//        Predicate<String> pred = s -> {
//
//            if (s.contains("J")) {
//                return true;
//            } else return false;
//        };

        //Predicate<Person> p = p1 -> p1.getFirstName().startsWith("J");



        persons.add(new Person("Janet"," Joplin"));
        persons.add(new Person("Kurt"," Cobain"));
        persons.add(new Person("Jimmy"," Hendrix"));
        persons.add(new Person("Amy"," Winehouse"));
        persons.add(new Person("Jim"," Morrison"));


        //
        //persons.removeIf(p -> p.getFirstName().startsWith("J"));

        for (Person p: persons) {

            System.out.println(p.toString());

        }


       // persons.forEach(p -> System.out.println(p.toString()));




    }

}
