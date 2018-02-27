package com.javarush.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Person {
    private String name;
    private Sex sex;
    private Date birthDay;

    private Person(String name, Sex sex, Date birthDay) {
        this.name = name;
        this.sex = sex;
        this.birthDay = birthDay;
    }

    public static Person createMale(String name, Date birthDay) {
        return new Person(name, Sex.MALE, birthDay);
    }

    public static Person createFemale(String name, Date birthDay) {
        return new Person(name, Sex.FEMALE, birthDay);
    }

    public static Person createPerson(String name, String sex, String date) {

        Sex sexPeople = Sex.MALE;
        Date datePeople = null;

        try {
            datePeople = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(date);
        } catch (ParseException e) {
            System.out.println("Incorrect Birthday!");
            e.printStackTrace();
        }

        if (sex.equals("ж")) sexPeople = Sex.FEMALE;

        //Solution.allPeople.add(new Person(name, sexPeople, datePeople));
        return new Person(name, sexPeople, datePeople);
    }

    public static void showPerson(Person person) {
        String sexSymbol = person.getSex().equals(Sex.MALE) ? "м":"ж";
        Date datePeopleToShow = person.getBirthDay();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        sdf.format(datePeopleToShow);
        System.out.println(person.getName()+" "+sexSymbol+ " "+sdf.format(datePeopleToShow));
    }

    public static void updatePerson(String id, String name, String sex, String bd) {

    }

    public static Person deletePerson() {
        return new Person(null, null,null);
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", birthDay=" + birthDay +
                '}';
    }
}