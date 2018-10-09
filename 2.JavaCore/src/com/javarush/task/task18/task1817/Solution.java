package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {

        String filename = args[0];

        int countSymbols = 0, countSpaces = 0;

        FileInputStream fileInputStream = new FileInputStream(filename);

        while (fileInputStream.available() > 0) {
            if ((char)fileInputStream.read() == ' ') {
                countSpaces++;
                countSymbols++;
            } else {
                countSymbols++;
            }
            ;
        }

        fileInputStream.close();

        //System.out.println("Spaces: "+ countSpaces + " Symbols: "+ countSymbols);

        //double d = (double) countSymbols/countSpaces;
        //d= Math.round(d*100);
        //d = d/100;

        //System.out.println(d);
        if (countSymbols != 0) {
            System.out.format("%.2f", 1.0 * countSpaces / countSymbols * 100);
        }
        }
}
