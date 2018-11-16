package com.javarush.task.task21.task2113;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kirill on 15.11.2018.
 */
public class Hippodrome {

    private List<Horse> horses;

    static Hippodrome game;

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    public List getHorses() {
        return horses;
    }

    public void move(){
        for (Horse horse : horses) {
            horse.move();
        }
    }

    public void print() {
        horses.forEach(Horse::print);
        for (int i = 0; i < 10; i++) {
            System.out.println();
        }
    }

    public void run() {
        for (int i = 0; i < 100 ; i++) {
            move();
            print();
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {

        game = new Hippodrome(new ArrayList<>());

        Horse horse1 = new Horse("Murka", 3, 0);
        Horse horse2 = new Horse("Sivka", 3, 0);
        Horse horse3 = new Horse("Burka", 3, 0);

        game.getHorses().add(horse1);
        game.getHorses().add(horse2);
        game.getHorses().add(horse3);



    }
}
