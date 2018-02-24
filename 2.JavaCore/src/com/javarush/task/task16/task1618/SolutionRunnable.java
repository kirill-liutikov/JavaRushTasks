package com.javarush.task.task16.task1618;

/* 
Снова interrupt
*/

public class SolutionRunnable {
    public static void main(String[] args) throws InterruptedException {
        TestThread t1 = new TestThread();
        t1.getThread().interrupt();
    }

    //Add your code below - добавь код ниже
    public static class TestThread implements Runnable{

        Thread thread;

        public TestThread() {
            thread = new Thread(this);
            thread.start();
        }

        public Thread getThread() {
            return thread;
        }


        @Override
        public void run() {
            while (!thread.isInterrupted()) {
                System.out.println("Идет ");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    break;
                }
            }
        }
    }
}