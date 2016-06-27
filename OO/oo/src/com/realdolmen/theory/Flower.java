package com.realdolmen.theory;

/**
 * Created by stannisbaratheon on 08/06/16.
 */
public class Flower {
    private String name;
    private String color;
    private int nectar;

    public Flower() {
        this.name="Unknown";
        this.color="Unknown";
        this.nectar=0;


    }

    public Flower(String name, String color, int nectar) {
        this.name = name;
        this.color = color;
        this.nectar = nectar;
    }

    public boolean acceptWorker(Worker w) {

        if (nectar == 0 || w.getRemaining() == 0) {
            return false;

        } else if (w.getRemaining() <= nectar) {

            nectar -= w.getRemaining();
            w.setLoad(w.getCapacity());

            return true;
        } else {

            w.setLoad(w.getLoad() + nectar);
            nectar =0;

            return true;


        }




    }
}
