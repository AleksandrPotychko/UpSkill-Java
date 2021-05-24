package com.epam.entity;

import java.util.Objects;

public class TextFile extends File {
    private StringBuilder text;

    public TextFile(String fileName) {
        super(fileName);
    }

    public TextFile(String fileName, StringBuilder text) {
        super(fileName);
        this.text = text;
    }

    public void printFile() {
        System.out.println("File {" + getFileName() + ", text: " + text + '}');
    }

    public StringBuilder getText() {
        return text;
    }

    public void setText(StringBuilder text) {
        this.text = text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TextFile textFile = (TextFile) o;
        return Objects.equals(text, textFile.text) && Objects.equals(getFileName(), textFile.getFileName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(text, getFileName());
    }

    @Override
    public String toString() {
        return "Text file: " + getFileName() + "{" + text + '}';
    }
}
