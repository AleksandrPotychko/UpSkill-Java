package com.epam.unit;

import com.epam.entity.File;
import com.epam.entity.TextFile;
import java.util.ArrayList;
import java.util.List;

public class FileInitializer {
    public static List<File> createFiles() {
        List<File> files = new ArrayList<>();
        files.add(new File("First file"));
        files.add(new File("Second", new StringBuilder("Text in second file")));
        files.add(new TextFile("Text file", new StringBuilder("Hello word.")));
        return files;
    }
}
