package com.javarush.task.task18.task1827;

/* 
Прайсы
*/

import java.io.*;

public class Solution {

        public static void writeLine(String productName, String price, String quantity, String fileName, int lastId) throws IOException {
            BufferedWriter bw = new BufferedWriter(new FileWriter(fileName, true));
            bw.newLine();
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
        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //String fileName = reader.readLine();
        String fileName = "C:\\Users\\карамба\\IdeaProjects\\JavaRushTasks\\2.JavaCore\\src\\com\\javarush\\task\\task18\\task1827\\price.txt";
        BufferedReader reader = new BufferedReader(new FileReader(fileName));

        String line, lastLine = "";
        while ((line = reader.readLine()) != null) {
            lastLine = line;
        }

        int lastId = Integer.parseInt(lastLine.substring(0, 8));

        if (args.length == 4) {
            String productName = padRight((args[1]), 30);
            //String productName = padRight((args[1].substring(0, 30)), 30);
            String price = padRight(args[2], 7);
            String quantity = padRight(args[3], 3);
            writeLine(productName, price, quantity, fileName, lastId);
        }

    }
}
