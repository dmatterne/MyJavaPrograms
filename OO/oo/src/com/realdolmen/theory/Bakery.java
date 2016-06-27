package com.realdolmen.theory;

/**
 * Created by stannisbaratheon on 08/06/16.
 */
public class Bakery {

    public static void main(String[] args) {

        Bakery bakery = new Bakery();
        Bread broodjeOld = bakery.bakeBread(BreadType.BOERENBROOD); //using old method
        Bread broodjeEnum = bakery.bakeBread(BreadType2.BOERENBROOD); //using new method
        System.out.println(broodjeOld.toString());
        System.out.println(broodjeEnum.toString());

        System.out.println(BreadType2.BOERENBROOD.calories);

    }


    public Bread bakeBread(BreadType type) {
        if (type == BreadType.BOERENBROOD) {
            return new Bread ("Boerenbrood" ,  900);
        } else if (type == BreadType.TIJGERBROOD) {
            return new Bread ("Tijgerbrood", 800);
        } else if (type == BreadType.MEERGRANENBROOD) {
            return new Bread ("Meergranenbrood", 900);
        } else { return new Bread("New Bread" , 1);


        }
    }

    public Bread bakeBread(BreadType2 type) {
        if (type == BreadType2.BOERENBROOD) {
            return new Bread ("Boerenbrood" ,  900);
        } else if (type == BreadType2.TIJGERBROOD) {
            return new Bread ("Tijgerbrood", 800);
        } else if (type == BreadType2.MEERGRANENBROOD) {
            return new Bread ("Meergranenbrood", 900);
        } else { return new Bread("New Bread" , 1);


        }
    }
}
