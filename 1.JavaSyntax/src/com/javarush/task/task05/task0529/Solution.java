package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

                String a = "";


                int summ = 0;

                while (!a.equals("сумма")) {
                    a = reader.readLine();
                    if (!a.equals("сумма")) {
                    summ += Integer.parseInt(a);}
                }

        System.out.println(summ);
    }
}
