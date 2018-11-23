package com.javarush.task.task22.task2208;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

/* 
Формируем WHERE
*/
public class Solution {
    public static void main(String[] args) {
        String s = "{name=Ivanov, country=Ukraine, city=Kiev, age=null}";

        Map<String, String> map = new LinkedHashMap<>();

        map.put("name", "Ivanov");
        map.put("country", "Ukraine");
        map.put("city", "Kiev");
        map.put(null, null);

        //map.forEach((k,v)-> System.out.println(k+" "+v));

        System.out.println(getQuery(map));

    }
    public static String getQuery(Map<String, String> params) {

        //map.forEach((key, value) -> System.out.println(key + " " + value));

        StringBuilder sb = new StringBuilder();

        params.entrySet().stream().filter(p -> p.getValue() != null && p.getKey() != null)
                .forEach(p -> sb.append(p.getKey()).append(" = ").append("'").append(p.getValue()).append("'").append(" and "));

        int len = sb.length();
        sb.setLength(len > 4 ? len-5 : 0);

        return sb.toString();
    }
}
