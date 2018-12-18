package com.javarush.task.task25.task2504;

/* 
Switch для нитей
*/
public class Solution {
    public static void processThreads(Thread... threads) {
        //implement this method - реализуйте этот метод
        for (Thread th : threads) {
            switch (th.getState()) {
                case NEW:
                    th.start();
                    break;
                case BLOCKED:
                case WAITING:
                case TIMED_WAITING:
                    th.interrupt();
                    break;
                case RUNNABLE:
                    th.isInterrupted();
                    break;
                case TERMINATED:
                    System.out.println(th.getPriority());
                    break;
            }

        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread[] threads = new Thread[5];
        threads[0] = new Thread();
        threads[0].start();
        threads[0].join();
        //System.out.println(threads[0].getState());
    }
}
