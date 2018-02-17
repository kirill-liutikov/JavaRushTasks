package com.javarush.task.task14.task1421;

/* 
Singleton
*/
public class Solution {
    public static void main(String[] args) {

        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();
        System.out.println(singleton);
        System.out.println(singleton1);
        NotSingleton n1 = NotSingleton.getInstance();
        NotSingleton n2 = NotSingleton.getInstance();
        System.out.println(n1);
        System.out.println(n2);

    }
}
