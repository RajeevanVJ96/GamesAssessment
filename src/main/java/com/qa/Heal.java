package com.qa;

public class Heal extends Player {

    public int getHeal() {
        return heal;
    }

    public void setHeal(int heal) {
        this.heal = heal;
    }

    private int heal;

    public Heal(int x, int y, int heal) {
        super(x, y);
        this.heal = heal;
    }
}
