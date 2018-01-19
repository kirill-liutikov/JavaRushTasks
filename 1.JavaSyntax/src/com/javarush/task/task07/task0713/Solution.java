package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list_3 = new ArrayList<>();
        ArrayList<Integer> list_2 = new ArrayList<>();
        ArrayList<Integer> list_other = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i <20 ; i++) {
            list.add(Integer.parseInt(reader.readLine()));

            if(list.get(i)%3 == 0 && list.get(i)%2 == 0) {
                list_2.add(list.get(i));
                list_3.add(list.get(i));
            } else if (list.get(i)%3 == 0) {
                list_3.add(list.get(i));
            } else if (list.get(i)%2 == 0) {
                list_2.add(list.get(i));
            } else {
                list_other.add(list.get(i));
            }
        }

        printList(list_3);
        printList(list_2);
        printList(list_other);
    }

    public static void printList(List<Integer> list) {
        //напишите тут ваш код
        for (int a:list) {
            System.out.println(a);
        }
    }
}
