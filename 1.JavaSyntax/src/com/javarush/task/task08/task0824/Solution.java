package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код

        Human child1 = new Human("child1", true,7);
        Human child2 = new Human("child2", false,8);
        Human child3 = new Human("child3", true,9);

        Human mother = new Human("mother", false, 33, child1, child2, child3);
        Human father = new Human("father", true, 34, child1, child2, child3);

        Human grandMother = new Human("grandMother", false, 71, mother);
        Human grandFather = new Human("grandFather", true, 72, mother);

        Human grandMother2 = new Human("grandMother2", false, 73, father);
        Human grandFather2 = new Human("grandFather2", true, 74, father);



        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);

        System.out.println(mother);
        System.out.println(father);

        System.out.println(grandFather);
        System.out.println(grandMother);
        System.out.println(grandFather2);
        System.out.println(grandMother2);
    }

    public static class Human {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<>();

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human ... children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children.addAll(Arrays.asList(children));
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
