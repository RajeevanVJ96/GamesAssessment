package com.qa;

public class Player {

    private int posX;
    private int posY;


    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public Player(int x, int y){
        this.posX = x;
        this.posY = y;

    }
}
