package com.javarush.task.task22.task2211;

import java.io.*;
import java.nio.charset.Charset;

/* 
Смена кодировки
*/
public class Solution {
    public static void main(String[] args) throws IOException {

        FileInputStream fileInputStream = new FileInputStream(args[0]);
        FileOutputStream fileOutputStream = new FileOutputStream(args[1]);

        byte[] bytesInp = new byte[fileInputStream.available()];
        fileInputStream.read(bytesInp);
        String str = new String(bytesInp, "Windows-1251");
        byte[] bytesOut = str.getBytes("UTF-8");
        fileOutputStream.write(bytesOut);
        fileOutputStream.close();
        fileInputStream.close();
    }
}
