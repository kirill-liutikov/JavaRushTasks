package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                int a = Integer.parseInt(reader.readLine());
                int b = Integer.parseInt(reader.readLine());
                int c = Integer.parseInt(reader.readLine());
                int d = Integer.parseInt(reader.readLine());

        int max = (Math.max(a,b) >= Math.max(c,d)) ? Math.max(a,b) : Math.max(c,d);

        System.out.println(max);
    }
}
