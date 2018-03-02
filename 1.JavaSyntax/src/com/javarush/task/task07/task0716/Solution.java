package com.javarush.task.task07.task0716;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

/* 
Р или Л
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        ArrayList<String> list = new ArrayList<String>();

        list.add("роза"); //0
        list.add("лоза"); //1
        list.add("лира"); //2
        list.add("роза"); //0
        list.add("лоза"); //1
        list.add("лира"); //2
        list.add("роза"); //0
        list.add("лоза"); //1
        list.add("лира"); //2
        list.add("роза"); //0
        list.add("лоза"); //1
        list.add("лира"); //2
        list = fix(list);

        for (String s : list) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list) {
        //напишите тут ваш код
        Iterator<String> i =  list.iterator();

        while (i.hasNext()) {

        String s = i.next();

        if (s.contains("р") && !s.contains("л")) {
                i.remove();}

        }

        int a = list.size();

        for (int j = 0; j < a; j++) {
            String s = list.get(j);
            if (s.contains("л") && !s.contains("р")) {
                list.add(s);
            }
        }

        return list;
    }
}