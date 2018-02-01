package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* 
Перепись населения

Создать словарь (Map<String, String>) занести в него десять записей по принципу "Фамилия" - "Имя".
Проверить сколько людей имеют совпадающие с заданным именем или фамилией.
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<>();
        String s1 = "Ivanov", s2 = "Ivan";
        for (int i = 0; i < 10; i++) {
            map.put(s1+i, s2+i);
        }
        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        //напишите тут ваш код
        int countCoincidence = 0;
        for (String s : map.values()) {
            if (s.equals(name)) countCoincidence++;
        }
        return countCoincidence;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        //напишите тут ваш код
        int countCoincidence = 0;
        for (String s : map.keySet()) {
            if(s.equals(lastName)) countCoincidence++;
        }
        return countCoincidence;

    }

    public static void main(String[] args) {

    }
}
