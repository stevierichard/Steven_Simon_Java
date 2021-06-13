package com.company;

import java.util.Objects;

public abstract class Constable extends BaseClass {

    private String jurisdiction;

    public Constable(String name, int strength, int health, int stamina, int speed, int attackPower, String jurisdiction) {
        super(name,  60, 100, 60, 20, 5);
        this.jurisdiction = jurisdiction;
    }

    @Override
    public void run() {

    }



    public void attack(){

    }

    public void heal(){

    }

    public void decreaseHealth(){

    }


    public void decreaseStamina(){

    }

    public void arrest(){

    }

    public void increasedStamina(){

    }

    public String getJurisdiction() {
        return jurisdiction;
    }

    public void setJurisdiction(String jurisdiction) {
        this.jurisdiction = jurisdiction;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Constable constable = (Constable) o;
        return Objects.equals(jurisdiction, constable.jurisdiction);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), jurisdiction);
    }

    @Override
    public String toString() {
        return "Constable{" +
                "jurisdiction='" + jurisdiction + '\'' +
                '}';
    }
}
