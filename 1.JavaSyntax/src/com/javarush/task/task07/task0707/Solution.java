package com.javarush.task.task07.task0707;

import java.util.ArrayList;

/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        ArrayList<String> list = new ArrayList<>();

        list.add("sdf");
        list.add("svbvdf");
        list.add("svcbdf");
        list.add("sghjhjdf");
        list.add("sjjjdf");

        System.out.println(list.size());

        for (String s: list) {
            System.out.println(s);
        }

    }
}
