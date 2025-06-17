package com.files;

import java.io.File;
import java.io.IOException;

public class FileHandling {
    public static void main(String[] args) throws IOException {
        File file =new File("src");
        System.out.println(file.isFile());
        System.out.println(file.getAbsoluteFile());
        System.out.println(file.getCanonicalFile());
        System.out.println(file.length());
        System.out.println(file.getParentFile());
        System.out.println(file.getParent());
        System.out.println(file.canExecute());
        System.out.println(file.canRead());
        System.out.println(file.canWrite());
        System.out.println(file.exists());
        System.out.println(file.getName());
        System.out.println(file.isDirectory());
        System.out.println(file.getPath());
    }
}
