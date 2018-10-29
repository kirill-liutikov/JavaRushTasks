package com.javarush.task.task20.task2013;

import java.io.*;
import java.util.List;

/* 
Externalizable Person
*/
public class Solution {
    public static class Person implements Externalizable{
        private String firstName;
        private String lastName;
        private int age;
        private Person mother;
        private Person father;
        private List<Person> children;

        //public Person() {
        //}

        public Person(String firstName, String lastName, int age) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
        }



        public void setMother(Person mother) {
            this.mother = mother;
        }

        public void setFather(Person father) {
            this.father = father;
        }

        public void setChildren(List<Person> children) {
            this.children = children;
        }

        @Override
        public void writeExternal(ObjectOutput out) throws IOException {
            out.writeObject(firstName);
            out.writeObject(lastName);
            out.writeInt(age);
            out.writeObject(mother);
            out.writeObject(father);
            out.writeObject(children);
        }

        @Override
        public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
            firstName = (String) in.readObject();
            lastName = (String) in.readObject();
            age = in.readInt();
            mother = (Person)in.readObject();
            father = (Person)in.readObject();
            children = (List<Person>)in.readObject();
        }

        @Override
        public String toString() {
            return "Person{" +
                    "firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", age=" + age +
                    ", mother=" + mother +
                    ", father=" + father +
                    ", children=" + children +
                    '}';
        }
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Person person = new Person("Иван", "Иванов", 27);
        String path = "C:\\Users\\kirill\\IdeaProjects\\JavaRushTasks\\2.JavaCore\\src\\com\\javarush\\task\\task20\\task2013\\test.txt";
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path));
        oos.writeObject(person);

        oos.close();

        Person personExt = null;

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path));

        personExt = (Person) ois.readObject();

        System.out.println(personExt);


    }
}
