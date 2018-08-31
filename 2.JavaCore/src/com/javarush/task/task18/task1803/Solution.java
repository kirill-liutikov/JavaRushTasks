package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String filepath = reader.readLine();

        FileInputStream fis = new FileInputStream(filepath);

        HashMap<Integer, Integer> byteFrequency = new HashMap<>();

        while (fis.available() > 0) {
            int currentByte = fis.read();
            //if (!byteFrequency.containsKey(currentByte)) byteFrequency.put(currentByte, 0);
            //byteFrequency.put(currentByte, byteFrequency.get(currentByte)+1);
            byteFrequency.merge(currentByte, 1, (a,b)->a+b);
        }

        //byteFrequency.forEach((k,v) -> {
        //    System.out.println("Key "+ k +  " Value "+v);
        //});

        int maxKey = Collections.max(byteFrequency.entrySet(), Map.Entry.comparingByValue()).getKey();

        if (byteFrequency.isEmpty()) {
            int maxValue = Collections.max(byteFrequency.values());
            for (Map.Entry entry : byteFrequency.entrySet()) {
                if ((int) entry.getValue() == maxValue) {
                    System.out.print(entry.getKey() + " ");
                }
            }
        }

        fis.close();


    }
}
