package com.javarush.task.task19.task1922;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
Ищем нужные строки
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String fileName = reader.readLine();



        BufferedReader fileReader = new BufferedReader(new FileReader(fileName));

        while (fileReader.ready()) {
            String line = fileReader.readLine();
            String[] wordsFile = line.split(" ");
            int coincidence = 0;
            for (int i = 0; i < wordsFile.length ; i++) {
                for (String word : words) {
                    if (word.equals(wordsFile[i])) coincidence++;
                }
            }

            if (coincidence == 2) System.out.println(line);
        }

        reader.close();
        fileReader.close();

    }
}
