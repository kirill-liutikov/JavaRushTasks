package com.javarush.task.task04.task0413;

/* 
День недели
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int numberDay = Integer.parseInt(reader.readLine());

        if (numberDay==1) {
            System.out.println("понедельник");
            return;
        }
        if (numberDay==2) {
            System.out.println("вторник");
            return;
        }
        if (numberDay==3) {
            System.out.println("среда");
            return;
        }
        if (numberDay==4) {
            System.out.println("четверг");
            return;
        }
        if (numberDay==5) {
            System.out.println("пятница");
            return;
        }
        if (numberDay==6) {
            System.out.println("суббота");
            return;
        }
        if (numberDay==7) {
            System.out.println("воскресенье");
            return;
        }
        if (numberDay<1 || numberDay>7) {
            System.out.println("такого дня недели не существует");
            return;
        }
    }
}