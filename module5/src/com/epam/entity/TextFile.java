package com.epam.entity;

public class TextFile extends File{
    public TextFile(String fileName) {
        super(fileName);
    }

    public TextFile(String fileName, StringBuilder text) {
        super(fileName, text);
    }
}
