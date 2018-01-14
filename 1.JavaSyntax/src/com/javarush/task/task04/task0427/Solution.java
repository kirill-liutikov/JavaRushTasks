package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        if(a>0&&a<1000){
            String x;
            if (a%2==0) x="четное";
            else x="нечетное";
            String y;
            if(a>99) y=" трехзначное ";
            else if(a>9) y=" двузначное ";
            else y=" однозначное ";
            String z="число";

            System.out.println(x+y+z);
        }

    }
}
