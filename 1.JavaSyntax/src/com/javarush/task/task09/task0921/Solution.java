package com.javarush.task.task09.task0921;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


/* 
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        //напишите тут ваш код
        ArrayList<Integer> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            try {
                int a = Integer.parseInt(reader.readLine());
                list.add(a);
            } catch (Exception e) {
                for (int number : list) {
                    System.out.println(number);
                }
                break;
            }
        }
    }
}
