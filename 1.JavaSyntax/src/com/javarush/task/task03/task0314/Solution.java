package com.javarush.task.task03.task0314;

/* 
Таблица умножения
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        int horizont =  1;
        int vertikal = 1;
        while (vertikal < 11) {
            while (horizont < 11) {
                System.out.print(horizont * vertikal+" ");
                horizont++;
            }
            System.out.println();
            horizont = 1;
            vertikal++;
            //System.out.println(vertikal);
        }
    }
}
