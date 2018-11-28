package com.javarush.task.task22.task2212;

import java.util.regex.Matcher;

/*
Проверка номера телефона
*/
public class Solution {
    public static boolean checkTelNumber(String telNumber) {
        if(telNumber == null) return false;
        if (telNumber.isEmpty()) return false;

        int digits = telNumber.replaceAll("\\D","").length();

        if (telNumber.charAt(0) == '+' && digits == 12 || telNumber.charAt(0) != '+' && digits == 10) {
            return telNumber.matches("\\+?3?8?\\(?\\d{3}\\)?\\d+(\\d+|-)?(\\d+|-)?(\\d+|-)?(\\d+|-)?");
        } else return false;
    }

    public static void main(String[] args) {
        String s1 = "+380501234567"; //true
        String s2 = "+38050123-45-67"; //true
        String s3 = "050123-4567"; //true
        String s4 = "+38)050(1234567"; //false
        String s5 = "+38(050)1-23-45-6-7"; //false
        String s6 = "050ххх4567"; //false
        String s7 = "050123456"; //false
        String s8 = "(0)501234567"; //false
        String s9 = "+38(050)1234567"; //true


        System.out.println("s1  " + checkTelNumber(s1));
        System.out.println("s2  " + checkTelNumber(s2));
        System.out.println("s3  " + checkTelNumber(s3));
        System.out.println("s4  " + checkTelNumber(s4));
        System.out.println("s5  " + checkTelNumber(s5));
        System.out.println("s6  " + checkTelNumber(s6));
        System.out.println("s7  " + checkTelNumber(s7));
        System.out.println("s8  " + checkTelNumber(s8));
        System.out.println("s9  " + checkTelNumber(s9));
    }
}
