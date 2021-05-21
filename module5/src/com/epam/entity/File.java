package com.epam.entity;

import java.util.Objects;

public class File {
    private String fileName;
    private StringBuilder text;

    public File(String fileName) {
        this.fileName = fileName;
    }

    public File(String fileName, StringBuilder text) {
        this.fileName = fileName;
        this.text = text;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public StringBuilder getText() {
        return text;
    }

    public void setText(StringBuilder text) {
        this.text = text;
    }

    public void renameFile(String fileName) {
        this.fileName = fileName;
    }

    public void printFile() {
        System.out.println("File {" + fileName + ", text: " + text + '}');
    }

    public void appendTextInFile(String appendText) {
        StringBuilder stringBuilder = new StringBuilder(getText());
        setText(stringBuilder.append(appendText));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        File file = (File) o;
        return Objects.equals(fileName, file.fileName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fileName);
    }

    @Override
    public String toString() {
        return "File {" + fileName +
                ", text: " + text +
                '}';
    }
}
