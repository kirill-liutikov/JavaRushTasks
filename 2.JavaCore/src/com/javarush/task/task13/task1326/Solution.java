package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws Exception{
        // напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename = reader.readLine();

        BufferedReader fileReader = new BufferedReader(new InputStreamReader(new FileInputStream(filename)));
        ArrayList<Integer> list = new ArrayList<>();

        //BufferedReader  br = new BufferedReader(new FileReader(filename));


        String line;
        while ((line = fileReader.readLine()) != null) {
            int b = Integer.parseInt(line);
            if (b%2 == 0) list.add(b);
        }

        Collections.sort(list);

        for (int a: list) {
            System.out.println(a);
        }

        fileReader.close();


    }
}
