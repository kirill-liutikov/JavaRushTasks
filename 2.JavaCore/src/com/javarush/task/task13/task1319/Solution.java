package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        // напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        //String fileName = "C:\\Users\\kirill\\IdeaProjects\\JavaRushTasks\\2.JavaCore\\src\\com\\javarush\\task\\task13\\task1319\\output.txt";

        String userEnter;

        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileName),"utf-8"));


        while (true) {
            userEnter = reader.readLine();
            writer.write(userEnter);
            writer.newLine();
            if (userEnter.equals("exit")) break;
        }



        reader.close();
        writer.close();
    }
}
