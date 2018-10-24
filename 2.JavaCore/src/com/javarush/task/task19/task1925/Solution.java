package com.javarush.task.task19.task1925;

/* 
Длинные слова
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        String file1 = args[0];
        String file2 = args[1];

        BufferedReader reader = new BufferedReader(new FileReader(file1));

        BufferedWriter writer = new BufferedWriter(new FileWriter(file2));

        while (reader.ready()) {
            String[] words = reader.readLine().split(" ");
            for (String s : words) {
                if (s.length() > 6 ) {
                    writer.write(s+",");
                }
            }
        }


    }
}
