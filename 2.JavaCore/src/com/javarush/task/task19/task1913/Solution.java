package com.javarush.task.task19.task1913;

/* 
Выводим только цифры
*/

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream consoleStream = System.out;

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

        PrintStream printStream = new PrintStream(byteArrayOutputStream);

        System.setOut(printStream);

        testString.printSomething();

        String line = byteArrayOutputStream.toString().replaceAll("[^\\d+]", "");

        System.setOut(consoleStream);

        System.out.println(line);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's 1 a 23 text 4 f5-6or7 tes8ting");
        }
    }
}