package com.epam.aggregation.util.init;

import com.epam.aggregation.entity.Sentence;
import com.epam.aggregation.entity.Text;

import java.util.ArrayList;
import java.util.List;


public class TextAggregator {

    public static void printText(Text text) {
        System.out.println(text);
    }

    public static List<Sentence> createSentences(Sentence string, Sentence stringTwo, Sentence string3) {
        List<Sentence> sentences = new ArrayList<>();
        sentences.add(string);
        sentences.add(stringTwo);
        sentences.add(string3);
        return sentences;
    }
}
