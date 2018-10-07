package com.javarush.task.task18.task1828;

/* 
Прайсы 2
*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution_2 {
    public static List<String> updateEntityList(List<String> list, String id, String productName, String price, String quantity) {
        ArrayList<String> updateList = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        sb.append(id).append(productName).append(price).append(quantity);
        for (String s : list) {
            if (Integer.parseInt(id.trim()) == Integer.parseInt(s.substring(0, 8).trim())) {
                updateList.add(sb.toString());
            } else updateList.add(s);
        }

        return updateList;
    }

    public static List<String> deleteEntity(List<String> list, int id) {
        for (String s : list) {
            if (id == Integer.parseInt(s.substring(0, 8).trim())) {
                list.remove(s);
            }
        }

        return list;
    }

    public static String padRight(String s, int n) {
        return String.format("%1$-" + n + "s", s);
    }


    public static void main(String[] args) throws IOException {
        BufferedReader readerConsole = new BufferedReader(new InputStreamReader(System.in));
        String fileName = readerConsole.readLine();

        //String fileName = "C:\\Users\\kirill\\IdeaProjects\\JavaRushTasks\\2.JavaCore\\src\\com\\javarush\\task\\task18\\task1828\\price.txt";
        BufferedReader reader = new BufferedReader(new FileReader(fileName));


       List<String> list = new ArrayList<>();
        while (reader.ready()) {
            list.add(reader.readLine());
        }

        if (args.length == 0) return;

        if (args[0].equals("-d")) {
            list = deleteEntity(list, Integer.parseInt(args[1]));
        }

        if (args[0].equals("-u")) {
            StringBuilder sb = new StringBuilder(args[2]);
            if (args.length>5) {
                for (int i = 3; i < (args.length-2); i++) {
                    sb.append(" ").append(args[i]);
                }
            }
            list = updateEntityList(list, padRight(args[1], 8), padRight(sb.toString(), 30), padRight(args[args.length-2], 8), padRight(args[args.length-1], 3));
        }


        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));

        for (String s : list) {
            writer.write(s);
            writer.newLine();
        }

        reader.close();
        writer.close();


    }
}
