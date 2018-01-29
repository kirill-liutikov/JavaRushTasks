package com.javarush.task.task08.task0804;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Вывести на экран список ключей
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Sim", "Sim");
        map.put("Tom", "Tom");
        map.put("Arbus", "Arbus");
        map.put("Baby", "Baby");
        map.put("Cat", "Cat");
        map.put("Dog", "Dog");
        map.put("Eat", "Eat");
        map.put("Food", "Food");
        map.put("Gevey", "Gevey");
        map.put("Hugs", "Hugs");

        printKeys(map);
    }



    public static void printKeys(Map<String, String> map) {
        //напишите тут ваш код
        map.forEach((k,v) -> System.out.println(k));

        //Set<String> set = map.keySet();
        //for (String s: set) {
        //    System.out.println(s);
        //}

        //for (Map.Entry<String, String> pair : map.entrySet()) {
        //    System.out.println(pair.getKey());
        //}
    }
}
