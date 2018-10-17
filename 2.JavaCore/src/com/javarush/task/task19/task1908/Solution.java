package com.javarush.task.task19.task1908;

/* 
Выделяем числа
*/

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();

        BufferedReader reader1 = new BufferedReader(new FileReader(fileName1));
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName2));

        while (reader1.ready()) {
            String readLine = reader1.readLine();
            Pattern p = Pattern.compile("\\b\\d+\\b");
            Matcher m = p.matcher(readLine);
            while (m.find()) {
                String match = m.group().replaceAll(" ", "");
                //System.out.println(match);
                writer.write(match+" ");
            }
        }

        reader.close();
        reader1.close();
        writer.close();

    }
}
