package com.javarush.task.task18.task1814;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/* 
UnsupportedFileName
*/

public class TxtInputStream extends FileInputStream {

    FileInputStream fis;


    public TxtInputStream(String fileName) throws IOException, UnsupportedFileNameException {
        super(fileName);
        int i = fileName.lastIndexOf('.');
        String ext = fileName.substring(i+1);
        if (!ext.equals("txt")) {
            super.close();
            throw new UnsupportedFileNameException();
            }
    }

    public static void main(String[] args) {
    }
}

