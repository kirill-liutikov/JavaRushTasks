package com.javarush.task.task06.task0606;

import java.io.*;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                String a = reader.readLine();
                int b = Integer.parseInt(a);


        for ( ; b!=0 ; ) {
           int c = (b%2 == 0) ? even++ : odd++;
           b=b/10;
        }
        System.out.println("Even: "+ even + " Odd: " + odd);
    }
}
