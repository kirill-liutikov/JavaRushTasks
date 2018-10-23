package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException, ParseException {

        String fileName = args[0];

        BufferedReader reader = new BufferedReader(new FileReader(fileName));

        while (reader.ready()) {
            String person = reader.readLine();
            String date = person.replaceAll("\\D+\\s|\\p{Punct}", "");
            //System.out.println(date);
            Date birthDate = new SimpleDateFormat("dd MM yyyy").parse(date);
            //System.out.println(birthDate);

            String name = person.replaceAll("\\d", "");
            //System.out.println(name.trim());

            PEOPLE.add(new Person(name.trim(), birthDate));
        }

        //PEOPLE.stream().forEach(System.out::println);

        reader.close();
    }
}
