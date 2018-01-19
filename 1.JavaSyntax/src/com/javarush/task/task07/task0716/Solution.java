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
        list = fix(list);

        for (String s : list) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list) {
        //напишите тут ваш код
        int a = list.size();

        Iterator<String> i =  list.iterator();


        while (i.hasNext()) {

        //String s = i.next();

            //if (s.contains("р") && s.contains("л")&&i.hasNext()) {
            //}
            //if (s.contains("р")&&i.hasNext()) {
            //    i.remove();
            //}
            //if (i.next().contains("л")) {
            //    list.add(i.next());
            //}
            System.out.println(i);

        }



        return list;
    }
}