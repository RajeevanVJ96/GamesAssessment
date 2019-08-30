package com.qa;

public class Trap extends Player{

    public int getHealthDecrease() {
        return healthDecrease;
    }

    public void setHealthDecrease(int healthDecrease) {
        this.healthDecrease = healthDecrease;
    }

    private int healthDecrease;

    public Trap(int x, int y, int healthDecrease) {
        super(x, y);
        this.healthDecrease = healthDecrease;
    }
}
