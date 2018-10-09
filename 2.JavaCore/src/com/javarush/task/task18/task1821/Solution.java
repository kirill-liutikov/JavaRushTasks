package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileName = args[0];

        BufferedReader  reader= new BufferedReader(new FileReader(fileName));

        Path filelocation = Paths.get(fileName);
        byte[] data = Files.readAllBytes(filelocation);

        TreeMap<Byte, Integer> map = new TreeMap<>();

        for (byte b : data) {
            if (map.putIfAbsent(b,1) != null) {
                map.merge(b, 1, Integer::sum);
            }
        }

        //map.entrySet().forEach(System.out::println);

        for (Map.Entry<Byte, Integer> entry : map.entrySet()) {
            System.out.println((char) entry.getKey().byteValue() + " "+ entry.getValue());
        }

        reader.close();


    }
}
