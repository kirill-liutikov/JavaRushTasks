package com.javarush.task.task17.task1711;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* 
CRUD 2



*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
        //allPeople.add(Person.createPerson("Сидоров Коля", "м", "25/12/1967")); //id=2
        //allPeople.add(Person.createPerson("Петрова Оля", "ж", "07/03/1987")); //id=3
        //allPeople.add(Person.createPerson("Цветкова Женя", "ж", "08/05/1989")); //id=4
    }

    public static void main(String[] args) {
        //start here - начни тут


        switch (args[0]) {
            case "-c":
                int countArgs = 1;
                for (int i = 1; i <= (args.length - 1) / 3; i++) {
                    synchronized (allPeople) {
                        allPeople.add(Person.createPerson(args[countArgs], args[countArgs + 1], args[countArgs + 2]));
                        System.out.println(allPeople.size()-1);
                        countArgs = i * 3 + 1;

                    }
                }
                break;

            case "-u":
                countArgs = 1;
                for (int i = 1; i <= (args.length - 1) / 4; i++) {
                    synchronized (allPeople) {
                        allPeople.set(Integer.parseInt(args[countArgs]), Person.createPerson(args[countArgs + 1], args[countArgs + 2], args[countArgs + 3]));
                        countArgs = i * 4 + 1;
                    }
                }
                break;

            case "-d":
                for (int i = 1; i <= args.length - 1; i++) {
                    synchronized (allPeople) {
                        allPeople.set(Integer.parseInt(args[i]), Person.deletePerson());
                    }
                }
                break;

            case "-i":
                for (int i = 1; i <= args.length - 1; i++) {
                    synchronized (allPeople) {
                        Person.showPerson(allPeople.get(Integer.parseInt(args[i])));
                    }
                }
                break;
        }

        //System.out.println("All people:");
        //for (Person p : allPeople) {
        //    //Person.showPerson(p);
        //    System.out.println(p);
        //}


    }
}
