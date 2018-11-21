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


        if (string.split(" ").length < 5) throw new TooShortStringException();

        int firstSpace = string.indexOf(" ");
        int secondSpace = string.indexOf(" ",firstSpace+1);
        int thirthSpace = string.indexOf(" ",secondSpace+1);
        int fourSpace = string.indexOf(" ",thirthSpace+1);
        int fiveSpace = string.indexOf(" ",fourSpace+1);

        if (fiveSpace == -1) return string.substring(firstSpace+1);
        return string.substring(firstSpace+1, fiveSpace);
    }

    public static class TooShortStringException extends RuntimeException {
    }
}
