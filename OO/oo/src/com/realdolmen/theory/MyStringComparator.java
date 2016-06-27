package com.realdolmen.theory;

import java.util.Comparator;

/**
 * Created by stannisbaratheon on 10/06/16.
 */
public class MyStringComparator implements Comparator<String> {



    @Override
    public int compare(String o1, String o2) {


            return o1.compareTo(o2);



    }
}
