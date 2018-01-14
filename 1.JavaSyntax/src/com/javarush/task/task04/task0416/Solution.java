package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double min = Double.parseDouble(reader.readLine());

        if (min%5 > 3 && min%5 < 4 ) {
        System.out.println("желтый");}
        else if (min%5 >= 4) {
            System.out.println("красный");
        } else {
            System.out.println("зеленый");
        }


    }
}