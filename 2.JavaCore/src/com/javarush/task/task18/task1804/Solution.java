package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String filePath = reader.readLine();

        FileInputStream fis = new FileInputStream(filePath);

        HashMap<Integer, Integer> mapFreqBytes = new HashMap<>();

        while (fis.available() > 0) {
            mapFreqBytes.merge(fis.read(), 1, Integer::sum);
        }

        //mapFreqBytes.forEach((k,v) -> System.out.println(k+" "+v));



        //System.out.println(minValue);
        if (!mapFreqBytes.isEmpty()) {
            int minValue = Collections.min(mapFreqBytes.values());
            for (Map.Entry entry : mapFreqBytes.entrySet()) {
                if ((int) entry.getValue() == minValue) {
                    System.out.print(entry.getKey() + " ");
                }
            }
        }
        fis.close();
        reader.close();

    }
}
