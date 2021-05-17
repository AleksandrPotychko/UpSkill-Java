package com.epam.aggregationandcomposition.util;

import com.epam.aggregationandcomposition.entity.Sentence;
import com.epam.aggregationandcomposition.entity.Word;
import java.util.ArrayList;
import java.util.List;

public class TextInitializer {
    public static Word createWord(String word) {
        return new Word(word);
    }

    public static Sentence createSentence(List<Word> words) {
        return new Sentence(words);
    }

    public static List<Sentence> createListSentence() {
        List<Sentence> sentenceList = new ArrayList<>();
        sentenceList.add(new Sentence(TextInitializer.createListWords()));
        sentenceList.add(new Sentence(TextInitializer.createListWords()));
        return sentenceList;
    }

    public static List<Word> createListWords() {
        List<Word> wordsList = new ArrayList<>();
        wordsList.add(new Word("Word"));
        wordsList.add(new Word("Summer"));
        wordsList.add(new Word("Rain"));
        wordsList.add(new Word("Car"));
        wordsList.add(new Word("Bite"));
        return wordsList;
    }
}
