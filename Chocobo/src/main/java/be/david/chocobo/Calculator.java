package be.david.chocobo;

/**
 * Created by stannisbaratheon on 23/06/16.
 */
public class Calculator {

    private final boolean active;


    public Calculator(boolean active) {
        this.active = active;
    }

    public Calculator() {
        this.active=false;
    }

    public boolean isActive() {
        return this.active;
    }

    public int multiply (int a, int b) {
        return a * b;
    }
}
