package com.realdolmen.myinteger;

/**
 * Created by stannisbaratheon on 10/06/16.
 */
public class MyInteger {
    int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public boolean isEven() {
        if (this.value % 2 == 0) {
                return true;
        } else return false;
    }

    public boolean isOdd() {
        if (this.value % 2 == 0) {
            return false;
        } else return true;
    }

    public boolean isPrime() {
        for(int i=2;i<value;i++) {
            if(value%i==0)
                return false;
        }
        return true;
    }

    // TO BE COMPLETED!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!


    public static int parseInt(char[] x) {
        return 0;
    }

    public static int parseString(String s) {
        return 0;
    }


    public boolean equals(int o) {
        if (this.value == o) {
            return true;
        } else {
            return false;
        }
    }


    public boolean equals(MyInteger o) {
        return value == o.value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MyInteger myInteger = (MyInteger) o;

        return value == myInteger.value;

    }

    @Override
    public int hashCode() {
        return value;
    }

    public static boolean isEven(MyInteger i) {
        return i.isEven();
    }

    public static boolean isOdd(MyInteger i) {
        return i.isOdd();
    }

    public static boolean isPrime(MyInteger i) {
        return i.isPrime();
    }

    public static boolean isEven(int i) {
        return new MyInteger(i).isEven();
    }

    public static boolean isOdd(int i) {
        return new MyInteger(i).isOdd();
    }

    public static boolean isPrime(int i) {
        return new MyInteger(i).isPrime();
    }

}
