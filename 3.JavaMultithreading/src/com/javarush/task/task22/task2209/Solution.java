package com.javarush.task.task22.task2209;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
Составить цепочку слов
*/
public class Solution {
    public static void main(String[] args) {
        //...

        String[] words = { "Киев", "Нью-Йорк", "Амстердам", "Вена", "Мельбурн"};
        StringBuilder result = getLine(words);
        System.out.println(result.toString());
    }

    public static StringBuilder getLine(String... words) {

        ArrayList<String> list = new ArrayList<>(Arrays.asList(words));

        Collections.sort(list);

        list.forEach(System.out::println);

        StringBuilder sb = new StringBuilder();
        for(String s : list) {
            sb.append(s);
        }

        return null;
    }
}
