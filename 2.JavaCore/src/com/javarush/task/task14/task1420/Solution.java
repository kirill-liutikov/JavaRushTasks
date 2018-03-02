package com.javarush.task.task14.task1420;

/* 
НОД
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args)  {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = 0;
        int b = 0;
        try {
            a = Integer.parseInt(reader.readLine());
            if (a <= 0) throw new IllegalArgumentException("First number must be positive");
            b = Integer.parseInt(reader.readLine());
            if (b <= 0) throw new IllegalArgumentException("Second number must be positive");
        } catch (IOException e) {
            e.printStackTrace();
        }

        //int a = 18;
        //int b = 30;
        System.out.println(nod(a,b));
        }

        public static int nod (int a, int b) {

            while (a !=0 && b !=0) {
                int tmp = a%b;
                a = b;
                b = tmp;
            }
            return a;
        }
}
