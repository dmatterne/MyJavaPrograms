package com.realdolmen.theory;

/**
 * Created by stannisbaratheon on 03/06/16.
 */
public class Soldier extends Bee {
    private int health;
    private int strength;
    private int defense;

    public Soldier(String name, int health, int strength, int defense) {
        super(name);
        this.health = health;
        this.strength = strength;
        this.defense = defense;
    }

    public Soldier() {
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public void fight() {
        System.out.println("Soldier " + super.getName() + " is fighting.");
    }
}
