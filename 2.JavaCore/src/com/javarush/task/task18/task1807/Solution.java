package com.javarush.task.task18.task1807;

/* 
Подсчет запятых
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        final int asciiComma = 44;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        FileInputStream fis = new FileInputStream(reader.readLine());

        int count = 0;

        while (fis.available() > 0) {
            if(fis.read() == asciiComma) {
                count++;
            }
        }

        System.out.println(count);

        reader.close();
        fis.close();

    }
}
