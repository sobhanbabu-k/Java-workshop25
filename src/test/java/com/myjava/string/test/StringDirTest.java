package com.myjava.string.test;

import com.myjava.string.java.CreateFileDir;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.io.File;
import java.io.IOException;

public class StringDirTest {
    @Test
    public void createDir() throws IOException {
        CreateFileDir createFileDir = new CreateFileDir();
        createFileDir.createDir("source");
        File file =new File("source");
        file.mkdir();
        file.createNewFile();
        Assertions.assertTrue(file.exists());
        createFileDir.createDir("test.txt");
        createFileDir.createDir("input.txt");
        createFileDir.createDir("output.txt");
        Assertions.assertEquals("test.txt",file);


    }
}
