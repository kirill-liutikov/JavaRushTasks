package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String filename1 = reader.readLine();
        String filename2 = reader.readLine();

        reader.close();

        BufferedReader readFile = new BufferedReader(new FileReader(filename1));
        BufferedWriter writer = new BufferedWriter(new FileWriter(filename2, true));


        while (readFile.ready()) {
            String s = readFile.readLine();
            String[] sArray = s.split(" ");
            for (String str : sArray) {
                //System.out.println(str);
                float f = Float.parseFloat(str);
                //System.out.println(f);
                int a = Math.round(f);
                System.out.println(a);
                writer.write(a+" ");

            }
        }
        //writer.flush();
        readFile.close();
        writer.close();
    }
}
