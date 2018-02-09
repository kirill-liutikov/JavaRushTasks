package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //        String s = reader.readLine();
        //        String[] array = s.split("/");
        Date date = new Date(new BufferedReader(new InputStreamReader(System.in)).readLine());
        /*for (int i = 0; i < array.length; i++) {
            System.out.println(Integer.parseInt(array[i]));
        }*/

        System.out.println(date.getMonth());

        //Date date = new Date(Integer.parseInt(array[2])-1900, Integer.parseInt(array[0])-1, Integer.parseInt(array[1]));
        SimpleDateFormat dateFormat = new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH);
        System.out.println(dateFormat.format(date).toUpperCase());
    }
}
