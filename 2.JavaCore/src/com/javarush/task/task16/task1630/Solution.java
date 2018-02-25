package com.javarush.task.task16.task1630;

import java.io.*;

public class Solution {
    public static String firstFileName;
    public static String secondFileName;

    //add your code here - добавьте код тут
    static {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //try {
        //    firstFileName = reader.readLine();
        //    secondFileName = reader.readLine();
        //    reader.close();
        //} catch (IOException e) {
        //    e.printStackTrace();
        //}
        firstFileName = "C:\\Users\\kirill\\IdeaProjects\\JavaRushTasks\\2.JavaCore\\src\\com\\javarush\\task\\task16\\task1630\\1.txt";
        secondFileName = "C:\\Users\\kirill\\IdeaProjects\\JavaRushTasks\\2.JavaCore\\src\\com\\javarush\\task\\task16\\task1630\\2.txt";
    }

    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        //add your code here - добавьте код тут
        f.join();
        System.out.println(f.getFileContent());
    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContent();

        void join() throws InterruptedException;

        void start();
    }

    //add your code here - добавьте код тут

    public static class ReadFileThread extends Thread implements ReadFileInterface {
        String fileName;
        String getFileContent="";

        @Override
        public void setFileName(String fullFileName) {
            this.fileName = fullFileName;
        }

        @Override
        public String getFileContent() {
            return getFileContent;
        }


        public void run() {
            StringBuilder sb = new StringBuilder();
            //StringBuffer sb = new StringBuffer();
            //String sb="";

            try {
                BufferedReader br = new BufferedReader(new FileReader(fileName));
                String line;
                while (br.ready()) {
                    line = br.readLine();
                    //sb = sb + line + " ";
                    sb.append(line);
                    sb.append(" ");
                }
                br.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
            getFileContent = sb.toString();
        }
    }
}


