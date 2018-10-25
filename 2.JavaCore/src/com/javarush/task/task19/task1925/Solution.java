package com.javarush.task.task19.task1925;

/* 
Длинные слова
*/

import java.io.*;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) throws IOException {
        String file1 = args[0];
        String file2 = args[1];

        BufferedReader reader = new BufferedReader(new FileReader(file1));

        BufferedWriter writer = new BufferedWriter(new FileWriter(file2));



        String tmp = reader.lines().flatMap(s -> Arrays.stream(s.split(" "))).filter(s -> s.length() >6).collect(Collectors.joining(","));
        writer.write(tmp);
        reader.close();
        writer.close();


    }
}
