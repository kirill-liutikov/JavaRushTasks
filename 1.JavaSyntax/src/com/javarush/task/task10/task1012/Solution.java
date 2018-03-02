package com.javarush.task.task10.task1012;

import sun.reflect.generics.tree.Tree;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/* 
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < abcArray.length; i++) {
            alphabet.add(abcArray[i]);
        }

        // ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 1; i++) {
            String s = reader.readLine();
            String correct = s.replaceAll("[\\w\\s]","");
            //System.out.println(correct);
            list.add(correct.toLowerCase());
        }


        // напишите тут ваш код
        /*
        TreeMap<Character, Integer> map = new TreeMap<>(new Comparator<Character>() {
            @Override
            public int compare(Character o1, Character o2) {
                int lp = abc.indexOf(o1);
                int rp = abc.indexOf(o2);
                if (lp != -1 && rp != -1) return new Integer(lp).compareTo(rp);
                return o1.compareTo(o2);
            }
        });

        for (int i = 0; i <abcArray.length; i++) {
            map.put(abcArray[i], 0);
        }

        for (int i = 0; i < list.size(); i++) {
                String temp = list.get(i);
                char[] tempArray = temp.toCharArray();
            for (int j = 0; j < tempArray.length; j++) {
                map.put(tempArray[j], map.get(tempArray[j])+1);
            }
        }


        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " "+ entry.getValue());
        }*/

        for (Character x : alphabet) {
            int count = 0;
            for (String s : list) {
                for (int i = 0; i < s.length(); i++) {
                    if (s.charAt(i)==x) count++;
                }
            }
            System.out.println(x + " " + count);
        }


    }

}
