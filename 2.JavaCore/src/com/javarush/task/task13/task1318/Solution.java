package com.javarush.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename = null;
        try {
            filename = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }


            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(filename)));

        while (br.ready()) {
            System.out.println(br.readLine());
        }

        reader.close();
        br.close();
    }
}