package com.miniProgrammTest.ReflectionApi;

import java.lang.reflect.Field;

/**
 * Created by kirill on 28.10.2018.
 */
public class MyClass {

    private int number;

    private String name = "default";

    //public MyClass(int number, String name) {
    //    this.number = number;
    //    this.name = name;
    //}

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }

    private void printData() {
        System.out.println(number + " " + name);
    }

    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        int number = myClass.getNumber();
        String name = null;
        System.out.println(number+name);

        try {
            Field field = myClass.getClass().getDeclaredField("name");
            field.setAccessible(true);
            name = (String) field.get(myClass);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
        System.out.println(number+name);

        System.out.println(MyClass.class.getName());

        MyClass myClass1 = null;

        try {
            Class clazz = Class.forName(MyClass.class.getName());
            myClass1 = (MyClass) clazz.newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
        }
        System.out.println(myClass);
        System.out.println(myClass1);



    }
}
