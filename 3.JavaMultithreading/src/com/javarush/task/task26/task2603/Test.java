package com.javarush.task.task26.task2603;

import java.util.Comparator;

/**
 * Created by карамба on 09.01.2019.
 */
public class Test implements Comparable{
    private String firstName;
    private String secondName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Object o) {
        return this.getFirstName().compareTo(((Test) o).getFirstName());
    }


    public class testSortByFirstName implements Comparator {

        @Override
        public int compare(Object o1, Object o2) {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello");
    }
}
