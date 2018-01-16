package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int a =0;
        int x =0;
        int y =0;

        while (a != -1) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            a = Integer.parseInt(reader.readLine());
            if(a!=-1) {
                x = x+a;
                y = y+1;
            }
        }

        System.out.println((float) x/y);
    }
}