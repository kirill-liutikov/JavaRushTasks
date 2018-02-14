package com.javarush.task.task12.task1229;

/* 
Родитель класса CTO
*/

public class Solution {

    public static void main(String[] args) {
        CTO cto = new CTO();
        cto.workHard();
        System.out.println(cto);
    }

    public static interface Businessman {
        public void workHard();
    }
    public static class Parent {
        public void workHard() {
            System.out.println("work");
        }
    }

    public static class CTO extends Parent implements Businessman {

    }
}
