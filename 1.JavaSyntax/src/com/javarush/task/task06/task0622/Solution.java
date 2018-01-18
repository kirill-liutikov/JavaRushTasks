package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        int[] a = new int[5];
        for (int i =0; i<5; i++){
            a[i] = Integer.parseInt(reader.readLine());
        }

        Arrays.sort(a);

        for (int b:a) {
            System.out.println(b);
        }

        //напишите тут ваш код
    }
}
