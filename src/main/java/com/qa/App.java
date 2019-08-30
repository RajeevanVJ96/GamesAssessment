package com.qa;


import java.util.Random;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int size = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to The Infinite Tesselating Swamp");
        System.out.println("To begin please enter the size of your game board");
        while(sc.hasNext()){
            try{
                String input = sc.next();
                size = Integer.parseInt(input);
                break;

            }catch(NumberFormatException n){
                System.out.println("Please enter a number.......");
            }

        }

        Random ran = new Random();
        int num = ran.nextInt(size + 1);

        Player p = new Player(ran.nextInt(size - 1) + 1, ran.nextInt(size - 1) + 1);
        Player treasure = new Player(ran.nextInt(size - 1) + 1,ran.nextInt(size - 1) + 1);
        Trap t = new Trap(ran.nextInt(size - 1) + 1,ran.nextInt(size - 1) + 1, 2);
        Heal h = new Heal(ran.nextInt(size - 1) + 1,ran.nextInt(size - 1) + 1, 1);

//        System.out.println(p.getPosX());
//        System.out.println(p.getPosY());
//        System.out.println(treasure.getPosX());
//        System.out.println(treasure.getPosY());
//        System.out.println(t.getPosX());
//        System.out.println(t.getPosY());
//        System.out.println(h.getPosX());
//        System.out.println(h.getPosY());

        int counter = 0;
        int health = 10;

        while((p.getPosX() != treasure.getPosX()) | (p.getPosY() != treasure.getPosY())){

            Directions.choicesDialogue();
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    counter++;
                    System.out.println("Going North...");
                    System.out.println(Directions.north(p,treasure,size));
                    break;
                case 2:
                    counter++;
                    System.out.println("Going East...");
                    System.out.println(Directions.east(p,treasure,size));
                    break;
                case 3:
                    counter++;
                    System.out.println("Going South...");
                    System.out.println(Directions.south(p,treasure,size));
                    break;
                case 4:
                    counter++;
                    System.out.println("Going West...");
                    System.out.println(Directions.west(p,treasure,size));
                    break;
            }
    }

        System.out.println("Congrats you found the treasure!!!!!!!!!!!!!!");
        if (counter < 5){
            System.out.println("You took " + counter + " turns, ya mad b******");
        }else if(counter > 5 & counter < 10){
        System.out.println("You took " + counter + " turns, could do better tbf");
        }else{
            System.out.println("You took " + counter + " turns, what a noob");
        }
    }


}

