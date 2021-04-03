package com.epam.regularexpressions;
import java.util.regex.Pattern;


public class ChooseOneOfTheActions {
    public static StringBuilder sortsParagraphs(String text) {
        StringBuilder resultString = new StringBuilder();
        String[] paragraphs = text.split("\n");
        int[] counterSentences = new int[paragraphs.length];
        int maxLengthParagraph = 0;
        for (int i = 0; i < paragraphs.length; i++) {
            String[] sentences = splitSentences(paragraphs[i]);
            counterSentences[i] = sentences.length;
            if (maxLengthParagraph < sentences.length) {
                maxLengthParagraph = sentences.length;
            }
        }
        for (int i = 1; i <= maxLengthParagraph; i++) {
            for (int j = 0; j < counterSentences.length; j++) {
                if (i == counterSentences[j]) {
                    resultString.append(paragraphs[j]);
                    resultString.append("\n");
                }
            }
        }
        return resultString;
    }

    public static StringBuilder sortsWords(String text, boolean isAscending) {
        StringBuilder resultString = new StringBuilder();
        String[] paragraphs = text.split("\n");
        for (String paragraph : paragraphs) {
            String[] sentences = splitSentences(paragraph);
            for (String sentence : sentences) {
                String[] words = splitWords(sentence);
                if (isAscending) {
                    for (int i = words.length - 1; i >= 0; i--) {
                        for (int j = 0; j < i; j++) {
                            if (words[j].length() > words[j + 1].length()) {
                                String swap = words[j];
                                words[j] = words[j + 1];
                                words[j + 1] = swap;
                            }
                        }
                    }
                } else {
                    for (int i = words.length - 1; i >= 0; i--) {
                        for (int j = 0; j < i; j++) {
                            if (words[j].length() < words[j + 1].length()) {
                                String swap = words[j];
                                words[j] = words[j + 1];
                                words[j + 1] = swap;
                            }
                        }
                    }
                }
                for (String  word : words) {
                    resultString.append(word);
                    resultString.append(" ");
                }
                resultString.append("\b. ");
            }
            resultString.append("\n");
        }
        return resultString;
    }

    private static String [] splitSentences(String text) {
        Pattern pattern = Pattern.compile("\\.*[.!?]\\s*");
        return pattern.split(text);
    }

    private static String [] splitWords(String sentence) {
        Pattern pattern = Pattern.compile("\\s*(\\s|,|;|:)\\s*");
        return pattern.split(sentence);
    }
}