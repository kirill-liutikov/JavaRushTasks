package com.javarush.task.task16.task1615;

/* 
Аэропорт
*/

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Solution {
    public  static volatile Runway RUNWAY = new Runway();   //1 взлетная полоса

    public static void main(String[] args) throws InterruptedException {
        for (int i = 1; i < 11; i++) {
            String name = "Самолет #" + i;
            new Plane(name);
        }
        //Plane plane1 = new Plane("Самолет #1");
        //Plane plane2 = new Plane("Самолет #2");
        //Plane plane3 = new Plane("Самолет #3");
    }

    private static void waiting(Plane plane) {
        //add your code here - добавь код тут
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss.SSS");
        try {
            Thread.sleep(10);
            LocalDateTime now = LocalDateTime.now();
            //System.out.println(dtf.format(now)+" "+plane.getName() + " ожидает waiting");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void takingOff(Plane plane) {
        //fix this method - исправь этот метод
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss.SSS");
        try {
            Thread.sleep(10);
            LocalDateTime now = LocalDateTime.now();
            //System.out.println(dtf.format(now)+" "+plane.getName() + " взлетает takingOff");
        } catch (InterruptedException e) {
        }
    }

    public static class Plane extends Thread {


        public Plane(String name) {
            super(name);
            start();
        }

        public void run() {
            boolean isAlreadyTakenOff = false;

            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss.SSS");

            while (!isAlreadyTakenOff) {
                if (RUNWAY.trySetTakingOffPlane(this)) {    //если взлетная полоса свободна, занимаем ее
                    System.out.println(dtf.format(LocalDateTime.now())+" "+getName() + " взлетает");
                    takingOff(this);//взлетает
                    System.out.println(dtf.format(LocalDateTime.now())+" "+getName() + " уже в небе");
                    isAlreadyTakenOff = true;
                    RUNWAY.setTakingOffPlane(null);
                } else if (!this.equals(RUNWAY.getTakingOffPlane())) {  //если взлетная полоса занята самолетом
                    System.out.println(dtf.format(LocalDateTime.now())+" "+getName() + " ожидает");
                    waiting(this); //ожидает
                }
            }
        }
    }

    public static class Runway { //взлетная полоса
        private Thread t;

        public Thread getTakingOffPlane() {
            return t;
        }

        public void setTakingOffPlane(Thread t) {
            synchronized (this) {
                this.t = t;
            }
        }

        public boolean trySetTakingOffPlane(Thread t) {
            synchronized (this) {
                if (this.t == null) {
                    this.t = t;
                    return true;
                }
                return false;
            }
        }
    }
}

