package com.myjava.string.test;

import com.myjava.string.java.ReadFile;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class StringFIleReadTest {
    @Test
    public void fileRead() throws IOException {
        ReadFile readFile = new ReadFile();
        readFile.readonly("file.txt", "This is file handling");
        File file = new File("file.txt");
        Assertions.assertTrue(file.exists());
        FileReader fileReader=new FileReader(file);
        Assertions.assertEquals("This is file handling",fileReader);
    }
}
