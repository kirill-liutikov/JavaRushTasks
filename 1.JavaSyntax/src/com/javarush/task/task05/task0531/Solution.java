package com.javarush.task.task05.task0531;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Совершенствуем функциональность
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        int[] a = new int[5];

        for (int i =0; i<5; i++) {
            a[i] = Integer.parseInt(reader.readLine());
        }

        int minimum = min(a[0],a[2],a[2],a[3],a[4]);

        System.out.println("Minimum = " + minimum);
    }


    public static int min( int a1,int a2, int a3, int a4, int a5) {

        int[] a = {a1, a2, a3, a4, a5};

        int min =Integer.MAX_VALUE;

        for (int i =0; i<a.length; i++) {

            if (min > a[i]) {
                min = a[i];
            }
        }

        return min;
    }
}
