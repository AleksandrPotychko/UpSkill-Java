package com.epam.stringorstringBuilder;


public class StringWorker {
    //task 1
    public static int calculateLargestNumberOfSpaces(String text) {
        int lengthOfSpaces = 0;
        int maxLengthOfSpaces = 0;
        final char[] characters = text.toCharArray();
        for (int i = 0; i < characters.length; i++) {
            if (characters[i] == ' ') {
                lengthOfSpaces++;
                if (lengthOfSpaces > maxLengthOfSpaces) {
                    maxLengthOfSpaces = lengthOfSpaces;
                }
            } else lengthOfSpaces = 0;
        }
        return maxLengthOfSpaces;
    }

    //task 2
    public static String insertBAfterAch(String text) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'a') {
                stringBuilder.append("ab");
            } else if ((text.charAt(i) == 'A')) {
                stringBuilder.append("AB");
            } else {
                stringBuilder.append(text.charAt(i));
            }
        }
        return stringBuilder.toString();
    }

    //task 3
    public static boolean isPalindrome(String word) {
        int wordLength = word.length();
        for (int i = 0; i < (wordLength / 2); i++) {
            if (word.charAt(i) != word.charAt(wordLength - i - 1)) {
                return false;
            }
        }
        return true;
    }

    //task 4
    public static String convertInfomaticaToCake(String word) {
        String cake = String.valueOf(word.charAt(word.indexOf('т')));
        cake += String.valueOf(word.charAt(word.indexOf('о')));
        cake += String.valueOf(word.charAt(word.indexOf('р')));
        cake += String.valueOf(word.charAt(word.indexOf('т')));
        return cake;
    }

    //task 5
    public static int calculateTheA(String text) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'a' || (text.charAt(i) == 'A')) {
                count++;
            }
        }
        return count;
    }

    //task 6
    public static String charactersDoubler(String text) {
        StringBuilder stringBuilder = new StringBuilder();
        int numberOfRepetitions = 2;
        for (int i = 0; i < text.length(); i++) {
            for (int j = 0; j < numberOfRepetitions; j++) {
                stringBuilder.append(text.charAt(i));
            }
        }
        return stringBuilder.toString();
    }

    //task 7
    public static String deleteRepeatedCharactersAndSpaces(String text) {
        String textWithOutSpaces = deleteSpaces(text);
        return deleteRepeatedCharacters(textWithOutSpaces);
    }

    private static String deleteSpaces(String text) {
        StringBuilder stringBuilder = new StringBuilder(text);
        for (int i = 0; i < stringBuilder.length(); i++) {
            if (stringBuilder.charAt(i) == ' ') {
                stringBuilder.deleteCharAt(i);
            }
        }
        return stringBuilder.toString();
    }

    private static String deleteRepeatedCharacters(String text) {
        StringBuilder stringBuilder = new StringBuilder(text);
        for (int i = 0; i < stringBuilder.length(); i++) {
            char character = stringBuilder.charAt(i);
            for (int j = i + 1; j < stringBuilder.length(); j++) {
                if (stringBuilder.charAt(j) == character) {
                    stringBuilder.deleteCharAt(j);
                }
            }
        }
        return stringBuilder.toString();
    }

    //task 8
    public static int calculateLargestNumberOfWord(String text) {
        int lengthOfWord = 0;
        int maxLengthOfWord = 0;
        final char[] characters = text.toCharArray();
        for (int i = 0; i < characters.length; i++) {
            if (characters[i] != ' ') {
                lengthOfWord++;
                if (lengthOfWord > maxLengthOfWord) {
                    maxLengthOfWord = lengthOfWord;
                }
            } else lengthOfWord = 0;
        }
        return maxLengthOfWord;
    }

    //task 9
    public static void calculateLowerAndUpperCase(String text) {
        int counterLowerCase = 0;
        int counterUpperCase = 0;
        final char[] characters = text.toCharArray();
        for (int i = 0; i < characters.length; i++) {
            if (characters[i] >= 'a' && characters[i] <= 'z') {
                counterLowerCase++;
            }
            if (characters[i] >= 'A' && characters[i] <= 'Z') {
                counterUpperCase++;
            }
        }
        System.out.println("Number of lowercase letters = " + counterLowerCase);
        System.out.println("Number of uppercase letters = " + counterUpperCase);
    }

    //task 10
    public static int calculateTheSentences(String text) {
        int counterSentences = 0;
        final char[] characters = text.toCharArray();
        for (int i = 0; i < characters.length; i++) {
            if (characters[i] == '.' || characters[i] == '!' || characters[i] == '?') {
                counterSentences++;
            }
        }
        return counterSentences;
    }
}