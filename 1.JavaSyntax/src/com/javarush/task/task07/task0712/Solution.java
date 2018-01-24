package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        ArrayList<String> strings = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            strings.add(reader.readLine());
        }


        int maxLenght = 0;
        int minLenght = Integer.MAX_VALUE;

        for (int i = 0; i < 10; i++) {

            if (strings.get(i).length() > maxLenght ) {
                maxLenght = strings.get(i).length();
            }
            if (strings.get(i).length() < minLenght) {
                minLenght = strings.get(i).length();
            }
        }

        for (int i = 0; i < 10; i++) {
            if (maxLenght == strings.get(i).length()) {
                System.out.println(strings.get(i));
                break;
            }
            if (minLenght == strings.get(i).length()) {
                System.out.println(strings.get(i));
                break;
            }

        }
    }
}
