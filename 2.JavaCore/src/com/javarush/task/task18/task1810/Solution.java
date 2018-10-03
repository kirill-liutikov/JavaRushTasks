package com.javarush.task.task18.task1810;

/* 
DownloadException
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws DownloadException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));





        while (true) {
            try {
                String fileName = reader.readLine();
                FileInputStream fis = new FileInputStream(fileName);
                if (fis.available() < 1000) {
                    reader.close();
                    fis.close();
                    throw new DownloadException();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static class DownloadException extends Exception {

    }
}
