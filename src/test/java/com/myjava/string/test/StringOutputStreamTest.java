package com.myjava.string.test;

import com.myjava.string.java.OutputStreamFile;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;

public class StringOutputStreamTest {
    @Test
    public void streamOutput(){
        OutputStreamFile outputStream = new OutputStreamFile();
        outputStream.streamFile("file.txt","This is java");
        File file = new File("file.txt");
        Assertions.assertTrue(file.exists());


    }
}
