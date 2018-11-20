package com.javarush.task.task22.task2202;

/* 
Найти подстроку
*/
public class Solution {
    public static void main(String[] args) throws TooShortStringException {
        System.out.println(getPartOfString("JavaRush - лучший сервис обучения Java."));
    }

    public static String getPartOfString(String string) throws TooShortStringException {

        if (string == null) throw new TooShortStringException();

        //System.out.println(string.split(" ").length);

        if (string.split(" ").length < 5) throw new TooShortStringException();

        int firstSpace = string.indexOf(" ");
        int secondSpace = string.indexOf(" ",15);
        int tirthSpace = string.indexOf(" ",secondSpace);
        int fourSpace = string.indexOf(" ",tirthSpace);

        System.out.println(fourSpace);

        return string.substring(firstSpace+1, fourSpace);
    }

    public static class TooShortStringException extends RuntimeException {
    }
}
