package com.javarush.task.task18.task1825;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Собираем файл
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader readerConsole = new BufferedReader(new InputStreamReader(System.in));
        TreeMap<Integer, String> map = new TreeMap<>();
        String s;
        ArrayList<String> list = new ArrayList<>();

        Pattern partFile = Pattern.compile("\\d+$");


        while (!(s = readerConsole.readLine()).equals("end")) {
                list.add(s);
        }

        readerConsole.close();

        for (String line : list) {
            Matcher matcher = partFile.matcher(line);
            if (matcher.find()) {
                System.out.println("Find: " + matcher.group());
                map.put(Integer.parseInt(matcher.group()), line);
            }
        }

        Pattern filePath = Pattern.compile(".*\\\\");

        //Path test = Paths.get(map.get(0));
        //String path = test.get

        for (Map.Entry m : map.entrySet()) {
            //System.out.println(m.getValue().toString());
            Matcher matcher = filePath.matcher(m.getValue().toString());
            if (matcher.find())
            {
                System.out.println("Find2:" +" "+matcher.group()); //Нашли
            }
        }




        File dir = new File("task1825/tmp");
        dir.mkdirs();
        File tmp = new File(dir, "tmp.txt");
        tmp.createNewFile();


        //String filePath =

    }
}
