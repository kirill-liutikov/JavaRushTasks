package com.javarush.task.task22.task2209;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
Составить цепочку слов
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //...
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename = reader.readLine();

        BufferedReader reader1 = new BufferedReader(new FileReader(filename));

        String content = reader1.readLine();

        String[] words = content.split(" ");
        StringBuilder result = getLine(words);
        System.out.println(result.toString());
    }

    public static StringBuilder getLine(String... words) {

        StringBuilder result = new StringBuilder();

        if (words == null || words.length == 0) return result;
        if (words.length==1||words[0].equals("")) return result.append(words[0]);

        ArrayList<String> list = new ArrayList<>(Arrays.asList(words));

        while (isSuccessively(list)) {
            Collections.shuffle(list);
        }

        list.stream().forEach(p -> result.append(p).append(" "));

        result.deleteCharAt(result.length()-1);


        return result;
    }

    public static boolean isSuccessively(List<String> words) {

        for (int i = 0; i < words.size()-1; i++) {
            String firstWord = words.get(i).toLowerCase();
            String secondWord = words.get(i+1).toLowerCase();

            if(firstWord.charAt(firstWord.length()-1) != secondWord.charAt(0)) return true;

        }

        return false;
    }
}
