package com.javarush.task.task08.task0823;

import javax.sound.midi.Soundbank;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        //напишите тут ваш код

        String[] arrayWords = s.split("\\b");

        for (int i = 0; i <arrayWords.length ; i++) {
            System.out.print(arrayWords[i].substring(0,1).toUpperCase() + arrayWords[i].substring(1) + " ");
        }

    }
}
