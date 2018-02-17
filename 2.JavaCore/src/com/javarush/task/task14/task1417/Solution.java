package com.javarush.task.task14.task1417;

import java.util.ArrayList;
import java.util.List;

/* 
Валюты
*/

public class Solution {
    public static void main(String[] args) {
        Person ivan = new Person("Иван");
        for (Money money : ivan.getAllMoney()) {
            System.out.println(ivan.name + " имеет заначку в размере " + money.getAmount() + " " + money.getCurrencyName());
        }

        System.out.println(ivan.getAllMoney().get(0).getAmount());
    }

    static class Person {
        public String name;

        Person(String name) {
            this.name = name;
            this.allMoney = new ArrayList<Money>();
            //напишите тут ваш код
        }

        private List<Money> allMoney;

        public List<Money> initAllMoney(List<Money> list) {
            list.add(new Hrivna(10));
            list.add(new Ruble(100));
            list.add(new USD(1000));
            return list;
        }

        public List<Money> getAllMoney() {
            initAllMoney(allMoney);
            return allMoney;
        }


    }
}
