package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        //напишите тут ваш код
        int hundreds = number/100;
        int decimal = (number%100)/10;
        int units = number%10;
        //System.out.println(hundreds);
        //System.out.println(decimal);
        //System.out.println(units);
        return hundreds+decimal+units;
    }
}