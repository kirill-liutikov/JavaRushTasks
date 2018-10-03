package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        FileInputStream fis = new FileInputStream(reader.readLine());

        HashMap<Integer, Integer> mapBytes = new HashMap<>();

        while (fis.available() > 0) {
            mapBytes.merge(fis.read(), 1, Integer::sum);
        }

        if (!mapBytes.isEmpty()) {

            ArrayList<Integer> listBytes = new ArrayList<>(mapBytes.keySet());

            Collections.sort(listBytes);

            listBytes.forEach(k -> System.out.print(k + " "));
        }

        fis.close();
        reader.close();
    }
}
