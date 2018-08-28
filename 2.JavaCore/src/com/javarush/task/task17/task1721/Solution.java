package com.javarush.task.task17.task1721;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

/*
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            String fileName1 = reader.readLine();
            String fileName2 = reader.readLine();

            File file1 = new File(fileName1);
            File file2 = new File(fileName2);

            BufferedReader reader1 = new BufferedReader(new FileReader(file1));
            BufferedReader reader2 = new BufferedReader(new FileReader(file2));

            allLines = reader1.lines().collect(toList());

            String s;

            while ((s=reader2.readLine())!= null) {
                forRemoveLines.add(s);
            }

            reader1.close();
            reader2.close();

        } catch (IOException e) {
            System.out.println("Error input");
        }

        try {
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Solution solution = new Solution();

        try {
            solution.joinData();
        } catch (CorruptedDataException e) {
            e.printStackTrace();
        }
        //() -> joinData();

    }

    public void joinData () throws CorruptedDataException {
        if (allLines.containsAll(forRemoveLines)) {
            allLines.removeAll(forRemoveLines);
        } else {
            allLines.clear();
            throw new CorruptedDataException();
        }
    }
}