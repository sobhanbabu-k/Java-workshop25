package com.myjava.string.test;

import com.myjava.string.java.FileOperation;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileContentCheckTest {
    @Test
    public void fileCheck() throws IOException {
        FileOperation fileOperation = new FileOperation();
        fileOperation.fileCreateWithContent("myFile.txt","This is Sobhan first file program");
        File myFile =new File("myFile.txt");
        Assertions.assertTrue(myFile.exists());
        FileReader fileReader = new FileReader(myFile);
        char[] content = new char[33];
        fileReader.read(content);
        System.out.println(content.length);
        System.out.println(content);
        Assertions.assertEquals("This is Sobhan first file program",String.valueOf(content));


    }


}
