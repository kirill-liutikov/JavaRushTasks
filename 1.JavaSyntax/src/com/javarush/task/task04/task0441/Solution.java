package com.javarush.task.task04.task0441;


/* 
Как-то средненько
*/
import java.io.*;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                int a = Integer.parseInt(reader.readLine());
                int b = Integer.parseInt(reader.readLine());
                int c = Integer.parseInt(reader.readLine());

        int[] massive = new int[3];

        massive[0] = a;
        massive[1] = b;
        massive[2] = c;

        Arrays.sort(massive);

        System.out.println(massive[1]);

    }


}
