package com.javarush.task.task05.task0532;

import java.io.*;
import java.util.Arrays;

/*
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = 0;

        int number = Integer.parseInt(reader.readLine());

        int[] massive = new int[number];

        for (int i =0; i < number; i++) {
            massive[i] = Integer.parseInt(reader.readLine());
        }

        Arrays.sort(massive);

        System.out.println(massive[number-1]);


    }
}
