package com.javarush.task.task19.task1923;

/* 
Слова с цифрами
*/

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileName1 = args[0];
        String fileName2 = args[1];

        BufferedReader fileReader = new BufferedReader(new FileReader(fileName1));
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(fileName2));

        Pattern pattern = Pattern.compile(".*\\d+.*");


        while (fileReader.ready()) {
            String line = fileReader.readLine();
            String[] lineSplit = line.split(" ");

            for (String s : lineSplit) {
                Matcher matcher = pattern.matcher(s);
                if (s.matches(".*\\d+.*")) fileWriter.write(s+" ");
            }
        }

        fileReader.close();
        fileWriter.close();
    }
}