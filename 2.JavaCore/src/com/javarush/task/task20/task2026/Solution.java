package com.javarush.task.task20.task2026;

/* 
Алгоритмы-прямоугольники
*/
public class Solution {
    public static void main(String[] args) {
        byte[][] a1 = new byte[][]{
                {1, 1, 0, 0},
                {1, 1, 0, 0},
                {1, 1, 0, 0},
                {1, 1, 0, 1}
        };
        byte[][] a2 = new byte[][]{
                {1, 0, 0, 1},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {1, 0, 0, 1}
        };

        int count1 = getRectangleCount(a1);
        //System.out.println("count = " + count1 + ". Должно быть 2");
        //int count2 = getRectangleCount(a2);
        //System.out.println("count = " + count2 + ". Должно быть 4");
    }

    public static int getRectangleCount(byte[][] a) {
        //int side = (int) Math.sqrt(a.length);
        System.out.println(a.length);

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j <a.length ; j++) {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
        return 0;
    }
}
