package com.myjava.string.java;

import java.io.FileWriter;
import java.io.IOException;

public class ReadFile {
    public void readonly(String file, String thisIsFileHandling) throws IOException {
        FileWriter fileWriter=new FileWriter("text.txt");
        fileWriter.write(thisIsFileHandling);
        fileWriter.close();
    }
}
