package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Выражаемся покороче
*/

public class Solution {


    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        ArrayList<String> strings = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        strings.add(reader.readLine());
        strings.add(reader.readLine());
        strings.add(reader.readLine());
        strings.add(reader.readLine());
        strings.add(reader.readLine());

        int minLength = Integer.MAX_VALUE;

        for (String s : strings) {
            if (s.length() < minLength) {
                minLength = s.length();
            }
        }
        for (String s : strings) {
            if (s.length() == minLength) {
                System.out.println(s);
            }
        }
    }
}
