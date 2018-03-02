package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Human human1 = new Human("bab", false, 72);
        Human human2 = new Human("ded", true, 73);
        Human human3 = new Human("bab1", false, 69);
        Human human4 = new Human("ded1", true, 68);
        Human human5 = new Human("ded", true, 25, human1,human2);
        Human human6 = new Human("ded", true, 26, human1,human2);
        Human human7 = new Human("ded", true, 12, human1,human2);
        Human human8 = new Human("ded", true, 11, human1,human2);
        Human human9 = new Human("ded", true, 10, human1,human2);

        System.out.println(human1);
        System.out.println(human2);
        System.out.println(human3);
        System.out.println(human4);
        System.out.println(human5);
        System.out.println(human6);
        System.out.println(human7);
        System.out.println(human8);
        System.out.println(human9);
    }

    public static class Human {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human (String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public String toString() {
            String text = "";
            text += "Имя человека: " + this.name;
            text += ", его пол: " + (this.sex ? "мужской" : "женский");
            text += ", его возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}






















