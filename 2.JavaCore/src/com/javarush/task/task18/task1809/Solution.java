package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                String file1 = reader.readLine();
                String file2 = reader.readLine();

        //String file1 = "C:\\Users\\kirill\\IdeaProjects\\JavaRushTasks\\2.JavaCore\\src\\com\\javarush\\task\\task18\\task1809\\file1.txt";
        //String file2 = "C:\\Users\\kirill\\IdeaProjects\\JavaRushTasks\\2.JavaCore\\src\\com\\javarush\\task\\task18\\task1809\\file2.txt";

        FileInputStream fis = new FileInputStream(file1);

        FileOutputStream fos = new FileOutputStream(file2);

        ArrayList<Byte> list = new ArrayList<>();
        ArrayList<Byte> listReverse = new ArrayList<>();

        while (fis.available() > 0) {
            list.add((byte)fis.read());
            //fos.write(fis.read());
        }


        for (int i =0; i < list.size(); i++) {
            Byte end = list.get(list.size() - i -1);

            listReverse.add(end);
        }

        listReverse.forEach(k -> {
            try {
                fos.write(k);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        fos.close();
        fis.close();
    }
}
