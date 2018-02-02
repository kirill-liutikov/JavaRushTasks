package com.javarush.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/*
Номер месяца
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String month = reader.readLine();

        Map<String, Integer> monthInYear = new HashMap<>();

        monthInYear.put("January", 1);
        monthInYear.put("February", 2);
        monthInYear.put("March", 3);
        monthInYear.put("April", 4);
        monthInYear.put("May", 5);
        monthInYear.put("June", 6);
        monthInYear.put("July", 7);
        monthInYear.put("August", 8);
        monthInYear.put("September", 9);
        monthInYear.put("October", 10);
        monthInYear.put("November", 11);
        monthInYear.put("December", 12);

        for (Map.Entry<String, Integer> entry  : monthInYear.entrySet()) {
            //System.out.println(entry.getKey());
            if (entry.getKey().equals(month)) {
                System.out.println(month + " is " + entry.getValue() + " month");
            }
        }
    }
}
