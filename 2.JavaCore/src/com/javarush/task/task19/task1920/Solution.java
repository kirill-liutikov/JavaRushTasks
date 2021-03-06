package com.javarush.task.task19.task1920;

/* 
Самый богатый
*/

import java.awt.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
            map.merge(array[0], Double.parseDouble(array[1]), Double::sum);
        }

        double max = map.values().stream().max(Double::compare).get();

        String[] listMax = map.entrySet().stream().filter(e -> e.getValue() == max).map(Map.Entry::getKey)
                .toArray(String[]::new);
        //System.out.println(max);
        //map.entrySet().forEach(System.out::println);

        Stream<String> stream = Arrays.stream(listMax);
        stream.forEach(System.out::println);




    }
}
