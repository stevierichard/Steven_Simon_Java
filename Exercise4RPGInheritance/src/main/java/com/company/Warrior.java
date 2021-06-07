package com.company;

import java.util.Objects;

public class Warrior extends BaseClass {
    private int shieldStrength;

    public Warrior(String name, int strength, int health, int stamina, int speed, int attackPower,int shieldStrength) {
        super(name, 75,100,100,50,10);
        this.shieldStrength = shieldStrength;
    }

    public int getShieldStrength() {
        return shieldStrength;
    }

    public void setShieldStrength(int shieldStrength) {
        this.shieldStrength = shieldStrength;
    }

    public void run(){
        System.out.println("I'm running");
    }

    public void attack(){

    }

    public void heal(){

    }

    public void decreaseHealth(){

    }

    public void increaseStamina(){

    }

    public void decreaseStamina(){

    }

    public void decreaseShieldStrength(){

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Warrior warrior = (Warrior) o;
        return shieldStrength == warrior.shieldStrength;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), shieldStrength);
    }

    @Override
    public String toString() {
        return "Warrior{" +
                "shieldStrength=" + shieldStrength +
                '}';
    }
}
