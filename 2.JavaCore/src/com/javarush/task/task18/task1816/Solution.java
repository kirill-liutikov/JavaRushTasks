package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws Exception{
        String filename = args[0];

        Pattern pattern = Pattern.compile("[a-zA-Z]+");


        BufferedReader reader = new BufferedReader(new FileReader(filename));

        ArrayList<String> lines = new ArrayList<>();

        while (reader.ready()) {
            lines.add(reader.readLine());
        }
        reader.close();

        StringBuilder sb = new StringBuilder();
        for (String s : lines) {
            Matcher matcher = pattern.matcher(s);
            while (matcher.find()) {
                sb.append(matcher.group());
            }
        }

        System.out.println(sb.toString().length());


    }
}
