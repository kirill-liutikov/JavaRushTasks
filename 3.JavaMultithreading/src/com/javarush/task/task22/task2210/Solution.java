package com.javarush.task.task22.task2210;

import java.util.ArrayList;
import java.util.StringTokenizer;

/*
StringTokenizer
*/
public class Solution {
    public static void main(String[] args) {
        String[] line = getTokens("level22.lesson13.task01", ".");
        for (String s: line
             ) {
            System.out.println(s);
        }
    }
    public static String [] getTokens(String query, String delimiter) {

        ArrayList<String> list = new ArrayList<>();

        StringTokenizer st = new StringTokenizer(query, delimiter);

        while (st.hasMoreTokens()) {
            list.add(st.nextToken());
        }

        return list.toArray(new String[list.size()]);
    }
}
