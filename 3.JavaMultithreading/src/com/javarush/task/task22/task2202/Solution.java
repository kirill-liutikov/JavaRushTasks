package com.javarush.task.task22.task2202;

/* 
Найти подстроку
*/
public class Solution {
    public static void main(String[] args) {
        System.out.println(getPartOfString("JavaRush - лучший сервис обучения Java."));
    }

    public static String getPartOfString(String string) {
        if (string == null) throw new TooShortStringException();
        if (string.split(" ").length < 5) throw  new TooShortStringException();

        String[] str = string.split(" ");
        return String.format("%s %s %s %s", str[1], str[2], str[3], str[4]);
    }

    public static class TooShortStringException extends RuntimeException{
    }
}
