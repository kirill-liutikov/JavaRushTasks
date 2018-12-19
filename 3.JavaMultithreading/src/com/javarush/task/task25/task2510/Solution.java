package com.javarush.task.task25.task2510;

/* 
Поживем - увидим
*/
public class Solution extends Thread {

    @Override
    public void run() {
        try {
            throw new Throwable();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    public Solution() {
        super.setUncaughtExceptionHandler((t, e) -> {
            if (e instanceof Error) {
                System.out.println("Нельзя дальше работать");
            } else if (e instanceof Exception) {
                System.out.println("Надо обработать");
            } else {
                System.out.println("Поживем - увидим");
            }
        });


    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.start();
    }
}
