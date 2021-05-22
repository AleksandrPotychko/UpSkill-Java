package com.epam.starter;

import com.epam.entity.Directory;
import com.epam.unit.FileInitializer;

public class TaskLauncher {
    private static String directoryName = "Folder";
    private static final String FILE_NAME = "Empty file";
    private static final String SECOND_FILE_NAME = "Siri";

    public static void main(String[] args) {
        // Task 1
        Directory directory = new Directory(directoryName,
                FileInitializer.createFiles(), FileInitializer.createTextFiles());
        directory.createFile(FILE_NAME);
        directory.getFiles().get(0).renameFile(SECOND_FILE_NAME);
        System.out.println(directory);
        directory.deleteFile(FILE_NAME);
        System.out.println(directory);
        directory.getTextFiles().get(1).appendTextInFile("Lalalend");
        System.out.println(directory);
    }
}
