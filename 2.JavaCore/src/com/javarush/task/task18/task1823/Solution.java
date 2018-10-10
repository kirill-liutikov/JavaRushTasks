package com.javarush.task.task18.task1823;


import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (String fileName = reader.readLine(); !fileName.equals("exit"); fileName = reader.readLine()) {
            ReadThread readThread = new ReadThread(fileName);
            readThread.start();
        }


    }

    public static class ReadThread extends Thread {
        public ReadThread(String fileName) throws IOException {
            FileInputStream fileInputStream = new FileInputStream(fileName);
            while (fileInputStream.available() > 0) {
                list.add(fileInputStream.read());
            }
            fileInputStream.close();
        }
        // implement file reading here - реализуйте чтение из файла тут

        ArrayList<Integer> list = new ArrayList<>();

        @Override
        public void run() {
            int freq = 0;
            int mostFreqElem= 0;
            for (int i = 0; i < 128; i++) {
                if ()Collections.frequency(list, i);
            }

        }
    }
}
