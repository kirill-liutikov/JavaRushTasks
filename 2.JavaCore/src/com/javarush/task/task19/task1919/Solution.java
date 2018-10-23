package com.javarush.task.task19.task1919;

/* 
Считаем зарплаты
*/

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileName = args[0];

        BufferedReader fileReader = new BufferedReader(new FileReader(fileName));

        ArrayList<String> list = new ArrayList<>();

        while (fileReader.ready()) {
            list.add(fileReader.readLine());
        }

        fileReader.close();

        Map<String, Double> map = new TreeMap<>();

        for (String s : list) {
            String[] array = s.split(" ");
            //System.out.println("Split result "+array[0]+array[1]);
            map.merge(array[0], Double.parseDouble(array[1]), Double::sum);
        }

        //Map<String, Double> sortedMap = map.entrySet().stream().sorted().collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> oldValue ,LinkedHashMap::new));
        map.forEach((key, value) -> System.out.println(key + " " + value));

        //sortedMap.entrySet().forEach(System.out::println);


    }
}
