package com.myjava.string.java;

import java.io.FileWriter;
import java.io.IOException;

public class FileOperation {

    public void fileCreateWithContent(String file, String s) throws IOException {
        FileWriter fileWriter = new FileWriter("myFile.txt");
        fileWriter.write(s);
        fileWriter.close();
    }
}
