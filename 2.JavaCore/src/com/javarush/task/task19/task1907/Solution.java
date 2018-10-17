package com.javarush.task.task19.task1907;

/* 
Считаем слово
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String filename = reader.readLine();

        BufferedReader readerFile = new BufferedReader(new FileReader(filename));

        int count = 0;

        while (readerFile.ready()) {
            String readLine = readerFile.readLine();
            Pattern p = Pattern.compile("[.:,\\s]world|[.:,\\s]world[.:,\\s]|[^a-zA-Z]world[.:,\\s]|^world[,.:\\s]");
            Matcher m = p.matcher(readLine);
                while (m.find()) {
                    //System.out.println(m.group());
                    count++;
                    //System.out.println(count);
                }
        }
        System.out.println(count);

        reader.close();
        readerFile.close();
    }
}
