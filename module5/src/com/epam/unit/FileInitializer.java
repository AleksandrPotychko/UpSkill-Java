package com.epam.unit;

import com.epam.entity.File;
import com.epam.entity.TextFile;
import java.util.ArrayList;
import java.util.List;

public class FileInitializer {
    public static List<File> createFiles() {
        List<File> files = new ArrayList<>();
        files.add(new File("First file"));
        return files;
    }

    public static List<TextFile> createTextFiles() {
        List<TextFile> textFiles = new ArrayList<>();
        textFiles.add(new TextFile("Second", new StringBuilder("Text in second file")));
        textFiles.add(new TextFile("Text file", new StringBuilder("Hello word.")));
        return textFiles;
    }
}
