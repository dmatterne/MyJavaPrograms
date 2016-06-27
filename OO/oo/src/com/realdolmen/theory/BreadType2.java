package com.realdolmen.theory;

/**
 * Created by stannisbaratheon on 08/06/16.
 */
public enum BreadType2 {
    BOERENBROOD(150),TIJGERBROOD(200),MEERGRANENBROOD(300);

    public final int calories;

    private BreadType2 (int calories) {
        this.calories=calories;


    }
}
