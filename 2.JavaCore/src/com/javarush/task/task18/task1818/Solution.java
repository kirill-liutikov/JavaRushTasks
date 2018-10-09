package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        String fileName3 = reader.readLine();

        BufferedReader readerF2 = new BufferedReader(new FileReader(fileName2));
        BufferedReader readerF3 = new BufferedReader(new FileReader(fileName3));
        BufferedWriter writerF1 = new BufferedWriter(new FileWriter(fileName1, true));

        while (readerF2.ready()) {
            writerF1.write(readerF2.readLine());
        }
        writerF1.flush();

        while (readerF3.ready()) {
            writerF1.write(readerF3.readLine());
        }
        reader.close();
        readerF2.close();
        readerF3.close();
        writerF1.close();




    }
}
