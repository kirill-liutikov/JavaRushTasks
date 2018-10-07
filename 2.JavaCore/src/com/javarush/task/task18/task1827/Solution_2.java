package com.javarush.task.task18.task1827;

/* 
Прайсы
*/

import java.io.*;
import java.util.ArrayList;

public class Solution_2 {

        public static void writeLines(ArrayList<String> lines, String productName, String price, String quantity, String fileName, int lastId) throws IOException {
            BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            }
            bw.write(Integer.toString(lastId+1));
            bw.write(productName);
            bw.write(price);
            bw.write(quantity);
            bw.close();
        }

        public static String padRight(String s, int n) {
            return String.format("%1$-"+n+"s", s);
        }

    public static void main(String[] args) throws Exception {
        BufferedReader readerConsole = new BufferedReader(new InputStreamReader(System.in));
        String fileName = readerConsole.readLine();
        //String fileName = "C:\\Users\\kirill\\IdeaProjects\\JavaRushTasks\\2.JavaCore\\src\\com\\javarush\\task\\task18\\task1827\\price.txt";
        BufferedReader reader = new BufferedReader(new FileReader(fileName));

        ArrayList<String> lines = new ArrayList<>();
        int maxId = 0;

        while (reader.ready()) {
            lines.add(reader.readLine());
        }

        for (String line : lines) {
            int currentId = Integer.parseInt(line.substring(0,8).trim());
            if (currentId > maxId)  maxId = currentId;
        }


        reader.close();


        if (args.length == 4 ) {
            String productName = padRight((args[1]), 30);
            String price = padRight(args[2], 8);
            String quantity = padRight(args[3], 3);
            writeLines(lines,productName, price, quantity, fileName, maxId);
        }

    }
}
