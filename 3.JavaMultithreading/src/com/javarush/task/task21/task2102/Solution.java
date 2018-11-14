package com.javarush.task.task21.task2102;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* 
Сравниваем модификаторы
*/
public class Solution {
    public static void main(String[] args) {
        int classModifiers = Solution.class.getModifiers();
        String s2 = String.format("%8s", Integer.toBinaryString(classModifiers & 0xFF)).replace(' ', '0');
        System.out.println(s2);
        String s3 = String.format("%8s", Integer.toBinaryString((byte)Modifier.ABSTRACT & 0xFF)).replace(' ', '0');
        System.out.println(s3);
        System.out.println(isModifierSet(classModifiers, Modifier.INTERFACE));   //true
        System.out.println(isModifierSet(classModifiers, Modifier.STATIC));   //false

        System.out.println(Modifier.INTERFACE);

        int methodModifiers = getMainMethod().getModifiers();
        //System.out.println(Modifier.STATIC);

        System.out.println(isModifierSet(methodModifiers, Modifier.STATIC));      //true
    }

    public static boolean isModifierSet(int allModifiers, int specificModifier) {
        return (allModifiers & specificModifier) !=0;
    }

    private static Method getMainMethod() {
        Method[] methods = Solution.class.getDeclaredMethods();
        for (Method method : methods) {
            if (method.getName().equalsIgnoreCase("main")) return method;
        }

        return null;
    }
}
