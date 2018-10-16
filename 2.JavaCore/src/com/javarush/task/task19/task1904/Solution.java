package com.javarush.task.task19.task1904;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.time.LocalDateTime;
import java.util.GregorianCalendar;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) {
        String person = "Иванов Иван Иванович 31 12 1950";

        PersonScannerAdapter psa = new PersonScannerAdapter(new Scanner(person));
        try {
            Person person1 = psa.read();
            System.out.println(person1);
        } catch (Exception e) {
            e.printStackTrace();
        }



    }

    public static class PersonScannerAdapter implements PersonScanner{

        private Scanner fileScanner;

        public PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }

        @Override
        public Person read() throws IOException {
            if (fileScanner.hasNext()) {
            String fileLine = fileScanner.nextLine();
                String[] person = fileLine.split(" ");
                GregorianCalendar calendar = new GregorianCalendar(Integer.parseInt(person[5]), Integer.parseInt(person[4])-1, Integer.parseInt(person[person.length-3]));
                Date birthdate = calendar.getTime();
                return new Person(person[1],person[2],person[0], birthdate);
            } else {
            return null;}
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}
