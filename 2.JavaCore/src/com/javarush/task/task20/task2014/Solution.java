package com.javarush.task.task20.task2014;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/* 
Serializable Solution
*/
public class Solution implements Serializable{
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        String path = "C:\\Users\\kirill\\IdeaProjects\\JavaRushTasks\\2.JavaCore\\src\\com\\javarush\\task\\task20\\task2014\\test.txt";

            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path));
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path));


            Solution savedObject = new Solution(5);

            oos.writeObject(savedObject);
            oos.close();

            Solution loadObject = (Solution) ois.readObject();

            System.out.println(savedObject);
            System.out.println(loadObject);

            ois.close();

    }

    private transient final String pattern = "dd MMMM yyyy, EEEE";
    private transient Date currentDate;
    private transient int temperature;
    String string;

    public Solution(int temperature) {
        this.currentDate = new Date();
        this.temperature = temperature;

        string = "Today is %s, and the current temperature is %s C";
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        this.string = String.format(string, format.format(currentDate), temperature);
    }

    @Override
    public String toString() {
        return this.string;
    }
}
