package com.javarush.task.task09.task0902;

/* 
И снова StackTrace
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //System.out.println(method1());
       // method1();

    }

    public static String method1() {
        method2();
        //напишите тут ваш код
        //System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
        return Thread.currentThread().getStackTrace()[2].getMethodName();

    }

    public static String method2() {
        method3();
        //напишите тут ваш код
        //System.out.println(Thread.currentThread().getName());
        return Thread.currentThread().getStackTrace()[2].getMethodName();

    }

    public static String method3() {
        method4();
        //напишите тут ваш код
        //System.out.println(Thread.currentThread().getName());
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }

    public static String method4() {
        method5();
        //напишите тут ваш код
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }

    public static String method5() {
        //напишите тут ваш код
        printStackTrace(Thread.currentThread().getStackTrace());

        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }

    public static void printStackTrace (StackTraceElement[] st) {
        System.out.println("Текущий метод: " + st[1].getMethodName());
        System.out.println("Размер стека элементов: "+st.length);
        System.out.println("Содержание стека:");
        for (int i =0; i < st.length;i++)
        {
            System.out.println("Индекс элемента: "+i+", значение элемента: "+st[i].getMethodName());
        }
        System.out.println("===============================");
        System.out.println("");
    }
}
