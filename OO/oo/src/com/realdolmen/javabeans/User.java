package com.realdolmen.javabeans;

import com.realdolmen.savingsaccount.*;

/**
 * Created by stannisbaratheon on 03/06/16.
 */
public class User {

    public static void main(String[] args) {

        Address address1 = new Address();
        Address address2 = new Address("The Aftcastle","25","X345D","San D'oria","Final Fantasy XI",true);
        //Address address4 = new Address("Test");




        address1.setActive(false) ;
        address1.setCountry("Final Fantasy X");




        System.out.println(address1.getAddressLine() );
        System.out.println(address2.getAddressLine() );


    }
}
