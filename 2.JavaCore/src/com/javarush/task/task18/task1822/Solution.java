package com.javarush.task.task18.task1822;

/* 
Поиск данных внутри файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        int id = Integer.parseInt(args[0]);

        BufferedReader readerConsole = new BufferedReader(new InputStreamReader(System.in));

        String fileName = readerConsole.readLine();

        readerConsole.close();

        BufferedReader readerFile = new BufferedReader(new FileReader(fileName));

        while (readerFile.ready()) {
            String line = readerFile.readLine();
            if (line.startsWith(args[0]+" ")) {
                System.out.println(line);
            }
        }
        readerFile.close();


    }
}
