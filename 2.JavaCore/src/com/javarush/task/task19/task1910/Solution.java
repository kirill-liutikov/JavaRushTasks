package com.javarush.task.task19.task1910;

/* 
Пунктуация
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();

        BufferedReader reader1 = new BufferedReader(new FileReader(fileName1));
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName2));

        while (reader1.ready()) {
            String line = reader1.readLine();
            writer.write(line.replaceAll("\\p{Punct}", ""));
        }

        reader.close();
        reader1.close();
        writer.close();
    }
}
