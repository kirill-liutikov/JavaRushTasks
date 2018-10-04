package com.javarush.task.task18.task1813;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* 
AmigoOutputStream
Wrapper - декоратор
*/

public class AmigoOutputStream extends FileOutputStream{
    public static String fileName = "C:/tmp/result.txt";

    FileOutputStream fos;

    public AmigoOutputStream(FileOutputStream fos) throws IOException {
        super(fileName);
        this.fos = fos;
    }

    @Override
    public void write(int b) throws IOException {
        fos.write(b);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        fos.write(b, off, len);
    }

    @Override
    public void flush() throws IOException {
        fos.flush();
    }

    @Override
    public void write(byte[] b) throws IOException {
        fos.write(b);
    }

    @Override
    public void close() throws IOException {
        fos.flush();
        String s = "JavaRush © All rights reserved.";
        fos.write(s.getBytes());
        fos.close();
    }

    public static void main(String[] args) throws IOException {
        new AmigoOutputStream(new FileOutputStream(fileName)).close();

    }

}
