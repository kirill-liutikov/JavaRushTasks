package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        int[] bigArray = new int[20];
        int[] minArray1 = new int[10];
        int[] minArray2 = new int[10];
        for (int i = 0; i < 20; i++) {
            bigArray[i] = Integer.parseInt(reader.readLine());

            if (i <10) {
                minArray1[i] = bigArray[i];
            } else {
                minArray2[i-10] = bigArray[i];}
        }

        for (int a: minArray2) {
            System.out.println(a);
        }


    }
}
