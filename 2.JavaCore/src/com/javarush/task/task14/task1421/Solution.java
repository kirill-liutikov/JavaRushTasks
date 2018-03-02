package com.javarush.task.task14.task1421;

/* 
Singleton
*/
public class Solution {
    public static void main(String[] args) {

        //Singleton singleton = Singleton.getInstance();
        //Singleton singleton1 = Singleton.getInstance();
        //Singleton singleton2 = Singleton.instance;
        Singleton singleton3 = new Singleton();


        //Singleton singleton3 = Singleton.getInstance();
        System.out.println(singleton3);

    }
}
