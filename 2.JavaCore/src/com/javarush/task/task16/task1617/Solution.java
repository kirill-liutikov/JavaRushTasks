package com.javarush.task.task16.task1617;

/* 
Отсчет на гонках
*/

public class Solution {
    public static volatile int countSeconds = 4;

    public static void main(String[] args) throws InterruptedException {
        RacingClock clock = new RacingClock();
        //add your code here - добавь код тут
        Thread.sleep(3500);
        clock.interrupt();
    }

    public static class RacingClock extends Thread {
        private int seconds = 0;

        public RacingClock() {
            start();
        }

        public void run() {


            //add your code here - добавь код тут

                try {
                    while (countSeconds > 0) {
                        System.out.print(countSeconds-- + " ");
                        Thread.sleep(1000);
                        //seconds++;
                    }
                    System.out.print("Марш!");
                    return;
                } catch (InterruptedException e) {
                    System.out.println("Прервано!");
                }


        }
    }
}
