package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напиште тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String key = "";


        while (true) {
            key = reader.readLine();
            if (key.equals("exit")) break;
            try {
                double n = Double.parseDouble(key);
                if (key.contains(".")) {
                    print(Double.parseDouble(key));
                }

                else if (Integer.parseInt(key) > 0 && Integer.parseInt(key) < 128) {

                    print((short) Integer.parseInt(key));
                } else if (Integer.parseInt(key) <= 0 || Integer.parseInt(key) >= 128) {
                    print(Integer.parseInt(key));
                }
            }
            catch (Exception e) {
                print(key);
            }
        }

        reader.close();

    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
