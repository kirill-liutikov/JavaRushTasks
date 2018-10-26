package com.javarush.task.task20.task2006;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
Как сериализовать?
*/
public class Solution {
    public static class Human implements Serializable{
        public String name;
        public List<Asset> assets = new ArrayList<>();

        public Human() {
        }

        public Human(String name, Asset... assets) {
            this.name = name;
            if (assets != null) {
                this.assets.addAll(Arrays.asList(assets));
            }
        }

        public String getName() {
            return name;
        }

        public List<Asset> getAssets() {
            return assets;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Human)) return false;

            Human human = (Human) o;

            if (!name.equals(human.name)) return false;
            return assets != null ? assets.equals(human.assets) : human.assets == null;
        }

        @Override
        public int hashCode() {
            int result = name.hashCode();
            result = 31 * result + (assets != null ? assets.hashCode() : 0);
            return result;
        }
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Human human = new Human("Ivan", new Asset("car"), new Asset("home"));
        FileOutputStream fos = new FileOutputStream("C:\\Users\\карамба\\IdeaProjects\\JavaRushTasks\\2.JavaCore\\src\\com\\javarush\\task\\task20\\task2006\\seriaz.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(human);

        fos.close();
        oos.close();

        FileInputStream fis = new FileInputStream("C:\\Users\\карамба\\IdeaProjects\\JavaRushTasks\\2.JavaCore\\src\\com\\javarush\\task\\task20\\task2006\\seriaz.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Human human_load = (Human) ois.readObject();

        System.out.println(human_load.getName());

        fis.close();
        oos.close();

        if (human ==(human_load)) System.out.println("equals");

    }
}
