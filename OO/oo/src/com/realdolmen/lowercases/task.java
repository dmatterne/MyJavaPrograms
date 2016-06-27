package com.realdolmen.lowercases;

import static java.lang.Character.isUpperCase;

/**
 * Created by stannisbaratheon on 15/06/16.
 */
public class task {
    public static void main(String[] args) {

        String name=  UsefullMethods.readString("Please enter a random sentence in lower and upper case letters: ");

       name.chars()
                  .filter(Character::isUpperCase)
                  //.filter(c -> isUpperCase(c))
                  .forEach(c -> System.out.print("" + (char) c));
    }
}
