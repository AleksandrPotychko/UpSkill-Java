package com.epam.regularexpressions;


import java.util.Arrays;

public class TextParser {
    public static StringBuilder sortParagraphs(String text) {
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

    public static StringBuilder sortWords(String text) {
        StringBuilder resultString = new StringBuilder();
        String[] paragraphs = text.split("\n");
        for (String paragraph : paragraphs) {
            String[] sentences = splitSentences(paragraph);
            for (String sentence : sentences) {
                String[] words = splitWords(sentence);
                for (int i = words.length - 1; i >= 0; i--) {
                    for (int j = 0; j < i; j++) {
                        if (words[j].length() > words[j + 1].length()) {
                            String swap = words[j];
                            words[j] = words[j + 1];
                            words[j + 1] = swap;
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

    public static StringBuilder sortLexemes(String text, String lexeme) {
        StringBuilder resultString = new StringBuilder();
        String [] paragraphs = text.split("\n");
        for (String paragraph : paragraphs) {
            String[] sentences = splitSentences(paragraph);
            for (String sentence : sentences) {
                String[] words = splitWords(sentence);
                for (int i = words.length - 1; i >= 0; i--) {
                    for (int j = 0; j < i; j++) {
                        int countLexemesFirstWord = 0;
                        int countLexemesSecondWord = 0;
                        for (int n = 0; n < words[j].length(); n++) {
                            if (String.valueOf(words[j].charAt(n)).compareToIgnoreCase(lexeme) == 0) {
                                countLexemesFirstWord++;
                            }
                        }
                        for (int n = 0; n < words[j + 1].length(); n++) {
                            if (String.valueOf(words[j + 1].charAt(n)).compareToIgnoreCase(lexeme) == 0) {
                                countLexemesSecondWord++;
                            }
                        }
                        if (countLexemesFirstWord < countLexemesSecondWord) {
                            String tmp = words[j];
                            words[j] = words[j + 1];
                            words[j + 1] = tmp;
                        } else if (countLexemesFirstWord == countLexemesSecondWord) {
                            String [] forCompare = {words[j], words[j + 1]};
                            Arrays.sort(forCompare);
                            words[j] = forCompare[0];
                            words[j + 1] = forCompare[1];
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
        return text.split("\\.*[.!?]\\s*");
    }

    private static String [] splitWords(String sentence) {
        return sentence.split("\\s*(\\s|,|;|:)\\s*");
    }
}