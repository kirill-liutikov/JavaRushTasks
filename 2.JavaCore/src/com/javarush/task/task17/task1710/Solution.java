package com.javarush.task.task17.task1710;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
        //allPeople.add(Person.createPerson("Миронов", "м", "15/04/1990"));
    }

    public static void main(String[] args) {
        //start here - начни тут
        //for (String s : args) {
        //    System.out.println(s);
        //}

        if (args[0].equals("-c")) {
            allPeople.add(Person.createPerson(args[1], args[2], args[3]));
            System.out.println(allPeople.size()-1);
        }
        if (args[0].equals("-u")) allPeople.set(Integer.parseInt(args[1]), Person.createPerson(args[2], args[3], args[4]));
        if (args[0].equals("-d")) allPeople.set(Integer.parseInt(args[1]), Person.deletePerson());
        if (args[0].equals("-i")) Person.showPerson(allPeople.get(Integer.parseInt(args[1])));



        //Person person = Person.createPerson("Update", Sex.FEMALE, new Date());

        //for (Person person : allPeople) {
        //    System.out.println(person);
        //}

        //Person.showPerson(allPeople.get(0));
       // Person.showPerson(allPeople.get(1));
       // Person.showPerson(allPeople.get(2));

    }
}
