package com.epam.entity;

import java.util.List;
import java.util.Objects;

public class Directory {
    private String directoryName;
    private List<File> files;
    private List<TextFile> textFiles;

    public Directory(String directoryName, List<File> files, List<TextFile> textFiles) {
        this.directoryName = directoryName;
        this.files = files;
        this.textFiles = textFiles;
    }

    public void createFile(String fileName) {
        files.add(new File(fileName));
    }

    public void createFile(String fileName, StringBuilder text) {
        files.add(new TextFile(fileName, text));
    }

    public void renameDirectory(String directoryName) {
        this.directoryName = directoryName;
    }

    public void printDirectory() {
        System.out.println("Directory {" + directoryName + files + textFiles + '}');
    }

    public void deleteFile(String nameFile) {
        for (int i = 0; i < files.size(); i++) {
            if (files.get(i).getFileName().equalsIgnoreCase(nameFile)) {
                files.remove(i);
            }
        }
    }

    public String getDirectoryName() {
        return directoryName;
    }

    public void setDirectoryName(String directoryName) {
        this.directoryName = directoryName;
    }

    public List<File> getFiles() {
        return files;
    }

    public void setFiles(List<File> files) {
        this.files = files;
    }

    public List<TextFile> getTextFiles() {
        return textFiles;
    }

    public void setTextFiles(List<TextFile> textFiles) {
        this.textFiles = textFiles;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Directory directory = (Directory) o;
        return Objects.equals(directoryName, directory.directoryName) && Objects.equals(files, directory.files) && Objects.equals(textFiles, directory.textFiles);
    }

    @Override
    public int hashCode() {
        return Objects.hash(directoryName, files, textFiles);
    }

    @Override
    public String toString() {
        return "Directory {" +
                directoryName +
                files +
                textFiles +
                '}';
    }
}
