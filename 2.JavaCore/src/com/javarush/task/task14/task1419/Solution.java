package com.javarush.task.task14.task1419;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //it's first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }

        //напишите тут ваш код

        try {
            Date.parse("abcd");;
        } catch (IllegalArgumentException e) {
            exceptions.add(e);
        }

        try {
            int[] a = new int[5];
            a[10] = 10;
        } catch (ArrayIndexOutOfBoundsException e) {
            exceptions.add(e);
        }

        try {
            FileInputStream fis = new FileInputStream("noFile");
        } catch (FileNotFoundException e) {
            exceptions.add(e);
        }

        try {
            Integer.parseInt("sd");

        } catch (NumberFormatException e) {
            exceptions.add(e);
        }

        try {
            Object a = null;
            a.hashCode();

        } catch (NullPointerException e) {
            exceptions.add(e);
        }

        try {
            Object s = new String();
            System.out.println((int) s);

        } catch (ClassCastException e) {
            exceptions.add(e);
        }

        try {
                String s = "abc";
                s.charAt(5);

        } catch (StringIndexOutOfBoundsException e) {
            exceptions.add(e);

        }

        try {
            Object o[] = new String[5];
            o[2] = new Integer(1);
        } catch (ArrayStoreException e) {
            exceptions.add(e);
        }

        try {
            int[] array = new int[-10];
        } catch (NegativeArraySizeException e) {
            exceptions.add(e);
        }
    }
}
