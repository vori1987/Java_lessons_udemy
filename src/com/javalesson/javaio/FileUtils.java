package com.javalesson.javaio;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Path;

public class FileUtils {


    public  void printIOFileDetails(String path) throws IOException{
        File file = new File(path);

        //get path details

        System.out.println("Absolute path " + file.getAbsolutePath());
        System.out.println("Relative path " + file.getPath());
        System.out.println("Free space in MBytes " + file.getFreeSpace() / 1000000);
        System.out.println("Parent directory " + file.getParent());
        System.out.println("Is absolute path " + file.isAbsolute());
        System.out.println("Current directory is: " + System.getProperty("user.dir"));

        if (file.isDirectory()){
            System.out.println("It is a directory. Printing content: ");
            String[] list = file.list();
            if (list != null){
                for (String el : list)
                    System.out.println(el);
            }
        } else {
            System.out.println("It is a file ");
            System.out.println("Creating a new file " + file.createNewFile());

            //Permissions
            System.out.println("Can read -" + file.canRead());
            System.out.println("Can write - " + file.canWrite());
            System.out.println("Can execute - " + file.canExecute());
            System.out.println("File is hidden - " + file.isHidden());
            System.out.println("Last modified - " + file.lastModified());
            System.out.println("Deleting a file  " + file.delete());

            Path filePath = file.toPath();

        }
    }
}
