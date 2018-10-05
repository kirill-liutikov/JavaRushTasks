package com.javarush.task.task18.task1826;

/* 
Шифровка
*/

import java.io.*;

public class Solution {

    private static void encodeFile(String fileName, String fileOutputName) {
        //method for encode file
    }

    private static void decodeFile() {

    }


    public static void main(String[] args) throws IOException {

        String fileName = args[1];
        String fileOutputName = args[2];

        //File fileIn = new File(args[1]);
        //File fileOut = new File(args[2]);

        FileInputStream fis = new FileInputStream(args[1]);
        FileOutputStream fos = new FileOutputStream(args[2]);

        //int b = fis.read();

        while (fis.available() > 0) {
            int b = fis.read();
            fos.write(b+1);
        }


        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[2]);
    }

}
