package com.javarush.task.task22.task2208;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/* 
Формируем WHERE
*/
public class Solution {
    public static void main(String[] args) {
        String s = "{name=Ivanov, country=Ukraine, city=Kiev, age=null}";

        Map<String, String> map = new HashMap<>();

        map.put("name", "Ivanov");
        map.put("country", "Ukraine");
        map.put("city", "Kiev");
        map.put("age", null);

        System.out.println(getQuery(map));

    }
    public static String getQuery(Map<String, String> params) {
        Map<String, String> map = params.entrySet().stream().filter(e->e.getValue()!=null).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        map.forEach((key, value) -> System.out.println(key + " " + value));

        StringBuilder sb = new StringBuilder();

        map.entrySet().stream().forEach(p -> sb.append(p.getKey()).append(" = ").append(p.getValue()));

        return sb.toString();
    }
}
