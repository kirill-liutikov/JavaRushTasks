package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] stringArray = new String[10];
        int[] intArray = new int[10];

        for (int i =0; i<10; i++) {
            stringArray[i] = reader.readLine();
            intArray[i] = stringArray[i].length();
        }

        for(int number : intArray) {
            System.out.println(number);
        }



    }
}
