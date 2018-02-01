package com.javarush.task.task08.task0816;

import java.time.LocalDate;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));
        map.put("Stallone1", new Date("MAY 1 1980"));
        map.put("Stallone2", new Date("JAN 1 1980"));
        map.put("Stallone3", new Date("DEC 1 1980"));
        map.put("Stallone4", new Date("JULY 1 1979"));
        map.put("Stallone5", new Date("AUG 1 1938"));
        map.put("Stallone6", new Date("JUNE 1 1958"));
        map.put("Stallone7", new Date("JUNE 1 1978"));
        map.put("Stallone8", new Date("JUNE 1 1932"));
        map.put("Stallone9", new Date("JUNE 1 1964"));

        return map;
        //напишите тут ваш код
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        //remove from Iterator
        //for (Iterator<Map.Entry<String, Date>> it = map.entrySet().iterator(); it.hasNext();) {
        //    int a = it.next().getValue().getMonth();
        //    if (a == 5 || a==6 || a==7) {
        //        it.remove();
        //    }
        //}


        //remove from Stream Api
        map.entrySet().removeIf(entry -> entry.getValue().getMonth() == 5 || entry.getValue().getMonth() == 6 || entry.getValue().getMonth() == 7);

    }

    public static void main(String[] args) {

        HashMap<String, Date> map = createMap();
        removeAllSummerPeople(map);

        map.forEach((k,v) -> System.out.println(k));

    }
}
