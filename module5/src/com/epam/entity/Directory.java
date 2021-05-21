package com.epam.entity;

import java.util.List;
import java.util.Objects;

public class Directory {
    private String directoryName;
    private List<File> files;

    public Directory(String directoryName, List<File> files) {
        this.directoryName = directoryName;
        this.files = files;
    }

    public void createEmptyFile(String fileName) {
        files.add(new File(fileName));
    }

    public void createFile(String fileName, StringBuilder text) {
        files.add(new File(fileName, text));
    }

    public void renameDirectory(String directoryName) {
        this.directoryName = directoryName;
    }

    public void printDirectory() {
        System.out.println("Directory: " + directoryName + ", files =" + files + '.');
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Directory directory = (Directory) o;
        return Objects.equals(directoryName, directory.directoryName) && Objects.equals(files, directory.files);
    }

    @Override
    public int hashCode() {
        return Objects.hash(directoryName, files);
    }

    @Override
    public String toString() {
        return "Directory: " + directoryName +
                ", files: " + files +
                '.';
    }
}
