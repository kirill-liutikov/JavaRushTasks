package com.javarush.task.task04.task0428;

/* 
Положительное число
*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                int a = Integer.parseInt(reader.readLine());
                int b = Integer.parseInt(reader.readLine());
                int c = Integer.parseInt(reader.readLine());

        List list = new ArrayList();
        list.add(a);
        list.add(b);
        list.add(c);

        int count = 0;
        for (Object o : list) {
            if ((int)o > 0) {
                count++;
            }
        }
        System.out.println(count);



    }
}
