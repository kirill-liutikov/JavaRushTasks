package com.javarush.task.task18.task1801;

import java.io.*;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));



        String file = reader.readLine();

        FileInputStream inputStream = new FileInputStream(file);

        int maxByte = -1;
        while (inputStream.available()>0) {
            int data = inputStream.read();
            if (data > maxByte) maxByte = data;
        }

        System.out.println(maxByte);

        reader.close();
        inputStream.close();
    }
}
