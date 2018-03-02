package com.javarush.task.task08.task0818;

import java.util.*;
import java.util.stream.Collectors;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        //напишите тут ваш код
        HashMap<String, Integer> map = new HashMap<>();
        String name = "Ivanov";
        int salary = 497;
        for (int i = 0; i < 10; i++) {
            map.put(name +i, salary +i);
        }
        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        //напишите тут ваш код
        //Java Stream Api
        //Map<String, Integer> mapFilter = map.entrySet().stream().filter(val -> val.getValue() > 500).collect(Collectors.toMap(p -> p.getKey(), p -> p.getValue()));
        //mapFilter.forEach((k,v) -> System.out.println(k+" "+v));
        //map.forEach((k,v) -> System.out.println(k+" "+v));

        for (Iterator<Map.Entry<String, Integer>> iter = map.entrySet().iterator(); iter.hasNext();) {
            Map.Entry<String, Integer> entry = iter.next();
            if (entry.getValue() < 500) {
                iter.remove();
            }
        }

    }

    public static void main(String[] args) {
        //HashMap<String, Integer> map = createMap();
        //removeItemFromMap(map);

    }
}