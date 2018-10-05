package com.javarush.task.task18.task1826;

/* 
Шифровка
*/

import java.io.*;

public class Solution {


    private static void encodeFile(String fileName, String fileOutputName) throws IOException {
        //method for encode file
        FileInputStream fileInputStream = new FileInputStream(fileName);
        FileOutputStream fileOutputStream = new FileOutputStream(fileOutputName);

        while (fileInputStream.available() > 0) {
            int b = fileInputStream.read();
            fileOutputStream.write(b+1);
        }
        fileInputStream.close();
        fileOutputStream.close();
    }

    private static void decodeFile(String fileName, String fileOutputName) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(fileName);
        FileOutputStream fileOutputStream = new FileOutputStream(fileOutputName);

        while (fileInputStream.available() > 0) {
            int b = fileInputStream.read();
            fileOutputStream.write(b-1);
        }
        fileInputStream.close();
        fileOutputStream.close();
    }


    public static void main(String[] args) throws IOException {

        String parameter = args[0];
        String fileName = args[1];
        String fileOutputName = args[2];

        if (parameter.equals("-e")) {
           encodeFile(fileName, fileOutputName);
        } else decodeFile(fileName, fileOutputName);

    }
}
