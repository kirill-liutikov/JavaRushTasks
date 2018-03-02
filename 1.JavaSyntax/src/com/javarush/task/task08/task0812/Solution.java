package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;

/*
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код

        ArrayList<Integer> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }

        int maxSequence=1;
        int tempSequence=1;

        for (int i = 1; i <10 ; i++) {
            if (list.get(i-1) == list.get(i)) {
                tempSequence++;
                maxSequence = Math.max(tempSequence, maxSequence);
            } else {
                tempSequence = 1;
            }
        }
        //maxSequence = Math.max(tempSequence, maxSequence); без этой избыточной строки решение не проходит

        System.out.println(maxSequence);

    }
}