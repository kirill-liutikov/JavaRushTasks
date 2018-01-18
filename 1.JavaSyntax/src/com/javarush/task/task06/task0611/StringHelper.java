package com.javarush.task.task06.task0611;

/* 
Класс StringHelper
*/

//import com.sun.org.apache.xpath.internal.operations.String;

public class StringHelper {
    public static String multiply(String s) {
        //String result = "";
        //StringBuilder builder = new StringBuilder(s);
        //for (int i =0; i <4; i++) {
        //    builder.append(s);
        //    //result += s;
        //}

        return new String(new char[5]).replace("\0", s);
        //напишите тут ваш код
        //return builder.toString();
    }

    public static String multiply(String s, int count) {
        String result = "";
        //напишите тут ваш код
        StringBuilder builder = new StringBuilder(s);
        for (int i =0; i <count-1; i++) {
            builder.append(s);
            //result += s;
        }
        //напишите тут ваш код
        return builder.toString();

    }

    public static void main(String[] args) {
        System.out.println(multiply("aaB"));

    }
}
