package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                int a = Integer.parseInt(reader.readLine());
                int b = Integer.parseInt(reader.readLine());
                int c = Integer.parseInt(reader.readLine());
        List list = new ArrayList <Integer>();
        list.add(a);
        list.add(b);
        list.add(c);

        Collections.sort(list);


        for (int i = list.size()-1; i > -1; i--) {
            System.out.println(list.get(i));
        }

    }
}
