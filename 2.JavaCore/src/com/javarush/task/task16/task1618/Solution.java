package com.javarush.task.task16.task1618;

/* 
Снова interrupt
*/

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        TestThread t1 = new TestThread();

        t1.start();
        t1.interrupt();

    }

    //Add your code below - добавь код ниже
    public static class TestThread extends Thread{





        @Override
        public void run() {
            System.out.println("Старт нити");
            while (!isInterrupted()) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Конец нити");
                    //e.printStackTrace();
                    break;
                }
            }
        }
    }
}