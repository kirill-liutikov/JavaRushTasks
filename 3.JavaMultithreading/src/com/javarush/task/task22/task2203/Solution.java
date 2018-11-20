package com.javarush.task.task22.task2203;

/* 
Между табуляциями
*/
public class Solution {
    public static String getPartOfString(String string) throws TooShortStringException {


        if (string == null) throw new TooShortStringException();


        if (string.split("\t").length < 3) {
            throw new TooShortStringException();
        }
        int indexOfFirstTab = string.indexOf("\t");
        if (indexOfFirstTab == -1) throw new TooShortStringException();

        return string.split("\t")[1];
    }

    public static class TooShortStringException extends Exception {
    }

    public static void main(String[] args) throws TooShortStringException {
        System.out.println(getPartOfString("\tJavaRush - лучший сервис \tобучения Java\t."));
    }
}
