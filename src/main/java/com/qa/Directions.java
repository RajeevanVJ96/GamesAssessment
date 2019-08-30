package com.qa;

public class Directions {

    public static void choicesDialogue(){
        System.out.println("1: NORTH");
        System.out.println("2: EAST");
        System.out.println("3: SOUTH");
        System.out.println("4: WEST");

    }

    public static String north(Player x, Player y, int size){
        if((x.getPosY() + 1) > size){
            x.setPosY(1);
        }else {
            x.setPosY(x.getPosY() + 1);
        }
        if (x.getPosX() == y.getPosX()) {
            return "You are " + Math.abs(x.getPosY() - y.getPosY()) + " from the treasure";
        }else if(x.getPosY() == y.getPosY()){
            return "You are " + Math.abs(x.getPosX() - y.getPosX()) + " from the treasure";
        }else {

            int height = findH(x, y);
            int width;
            width = findW(x, y);
            double distanceFromTreasure;
            distanceFromTreasure = Math.sqrt(height * height + (width * width));
            return "You are " + Math.round(distanceFromTreasure) + " from the treasure";
        }
    }

    public static String south(Player x, Player y, int size) {
        if ((x.getPosY() - 1) < 1) {
            x.setPosY(size);
        } else {
            x.setPosY(x.getPosY() - 1);
        }

        if (x.getPosX() == y.getPosX()) {
            return "You are " + Math.abs(x.getPosY() - y.getPosY()) + " from the treasure";
        }else if(x.getPosY() == y.getPosY()){
            return "You are " + Math.abs(x.getPosX() - y.getPosX()) + " from the treasure";
        }else {

            int height = findH(x, y);
            int width;
            width = findW(x, y);
            double distanceFromTreasure;
            distanceFromTreasure = Math.sqrt((height * height) + width * width);
            return "You are " + Math.round(distanceFromTreasure) + " from the treasure";
        }
    }

    public static String east(Player x, Player y, int size) {
        if ((x.getPosX() + 1) > size) {
            x.setPosX(1);
        } else {
            x.setPosX(x.getPosX() + 1);
        }

        if (x.getPosX() == y.getPosX()) {
            return "You are " + Math.abs(x.getPosY() - y.getPosY()) + " from the treasure";
        } else if (x.getPosY() == y.getPosY()) {
            return "You are " + Math.abs(x.getPosX() - y.getPosX()) + " from the treasure";
        } else {

            int height = findH(x, y);
            int width = findW(x, y);
            double distanceFromTreasure;
            distanceFromTreasure = Math.sqrt((height * height) + (width * width));

            return "You are " + Math.round(distanceFromTreasure) + " from the treasure";
        }
    }

    public static String west(Player x, Player y, int size){
        if((x.getPosX() - 1) < 1){
            x.setPosX(size);
        }
        else{
            x.setPosX(x.getPosX() - 1);
        }

        if (x.getPosX() == y.getPosX()) {
            return "You are " + Math.abs(x.getPosY() - y.getPosY()) + " from the treasure";
        }else if(x.getPosY() == y.getPosY())
            return "You are " + Math.abs(x.getPosX() - y.getPosX()) + " from the treasure";
        else {

            int height;
            height = findH(x, y);
            int width;
            width = findW(x, y);
            double distanceFromTreasure;
            distanceFromTreasure = Math.sqrt((height * height) + (width * width));
            return "You are " + Math.round(distanceFromTreasure) + " from the treasure";
        }
    }

    private static int findW(Player x, Player y) {
        if (y.getPosX() > x.getPosX()){
            return y.getPosX() - x.getPosX();
        }else{
            return x.getPosX() - y.getPosX();
        }

    }

    private static int findH(Player x, Player y) {
        if (y.getPosY() > y.getPosY()){
            return y.getPosX() - x.getPosX();
        }else{
            return x.getPosX() - y.getPosX();
        }

    }
    }

