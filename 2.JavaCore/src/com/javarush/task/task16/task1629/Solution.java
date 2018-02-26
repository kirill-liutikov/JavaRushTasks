package com.javarush.task.task16.task1629;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static volatile BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws InterruptedException {
        Read3Strings t1 = new Read3Strings();
        Read3Strings t2 = new Read3Strings();

        //add your code here - добавьте код тут

        //t1.run();
        //t2.run();

        t1.start();
        t1.join();
        t2.start();
        t2.join();

        t1.printResult();
        t2.printResult();
    }

    //add your code here - добавьте код тут

    public static class Read3Strings extends Thread {

        ArrayList<String> result = new ArrayList<>();


        public void printResult() {
            for(String s : result) {
                System.out.print(s+" ");
            }
        }

        public ArrayList getResult() {
            return result;
        }

        @Override
        public void run() {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            for (int i = 0; i < 3; i++) {
                try {

                    getResult().add(reader.readLine());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
