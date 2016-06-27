package com.realdolmen.theory;

/**
 * Created by stannisbaratheon on 02/06/16.
 */
public class Worker extends Bee {

    private int capacity;
    private int load = 0;

    public Worker()  {
        this("John Doe",0,0);
    }

    public Worker(String name,int capacity, int load) {

        super.setName(name);
        this.capacity=capacity;
        this.load=load;

    }

    public Worker (String name, int capacity) {
        this(name,capacity,0);
    }

    public void fly() {
        System.out.println("Worker " + super.getName()  + " is flying.");
    }

    public void gatherNectar() {
        load+=10;
        System.out.println("Worker " + super.getName() + " is gathering nectar. remaining space " + (capacity - load));
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {

        if (capacity < load) {
            capacity = load;
        }

        if (capacity < 0) {
            capacity = 0;
        }

        this.capacity = capacity;
    }

    public int getLoad() {
        return load;
    }

    public void setLoad(int load) {
        this.load = load;
    }

    public int getRemaining() {
        return this.capacity - this.load;
    }
}
