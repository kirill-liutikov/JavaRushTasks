package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) {
        //add your code here

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String URL = "";
        try {
            URL = reader.readLine();
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //String s1 = "http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo";

        //String s1 = "http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo";



        String sArray1[] = URL.split("\\?");

        String sArray2[] = sArray1[1].split("\\&");

        String param = "";

        for (String i : sArray2) {
            if (i.contains("=")) {
                String sArray3[] = i.split("=");
                for (int j = 0; j < sArray3.length; j++) {
                    if (sArray3[j].equals("obj")) param = sArray3[j+1];
                    //System.out.println(sArray3[j]);
                }
                System.out.print(sArray3[0]+" ");
            } else System.out.print(i+ " ");
        }



        if (!param.isEmpty()) {
            System.out.println();
            try {
                alert(Double.parseDouble(param));
            } catch (Exception e) {
                alert(param);
            }
        }


    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
