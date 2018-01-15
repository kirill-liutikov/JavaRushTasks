package com.javarush.task.task04.task0433;


/* 
Гадание на долларовый счет
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        int m = 100;
        while (m-- != 0) {
            System.out.print("S");
            if (m%10 == 0) {
                System.out.println();
            }

        }

    }
}
