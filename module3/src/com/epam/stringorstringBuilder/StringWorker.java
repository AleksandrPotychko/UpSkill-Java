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
            } else {
                lengthOfSpaces = 0;
            }
        }
        return maxLengthOfSpaces;
    }

    //task 2
    public static String insertBAfterA(String text, String regex, String replacement) {
        return text.replaceAll(regex, replacement);
    }

    //task 3
    public static boolean isPalindrome(String word) {
        return word.equals(new StringBuilder(word).reverse().toString());
    }

    //task 4
    public static String concatenateSpecifiedWordFromAnotherWord(String donorWord, String specifiedWord) {
        final int LENGTH_OF_WORD = specifiedWord.length();
        StringBuilder resultString = new StringBuilder();
        boolean areAllCharacters = true;
        for (int i = 0; i < LENGTH_OF_WORD; i++) {
            int indexOfSearchingLetter = donorWord.indexOf(specifiedWord.charAt(i));
            if (indexOfSearchingLetter != -1) {
                resultString.append(donorWord.charAt(indexOfSearchingLetter));
            } else {
                areAllCharacters = false;
                break;
            }
        }
        return (areAllCharacters) ? resultString.toString() : "";
    }

    //task 5
    public static int calculateTheA(String text, String letterA) {
        int occurrencesOfCharacter = 0;
        for (int i = text.indexOf(letterA); i != -1; i = text.indexOf(letterA, i + 1)) {
            occurrencesOfCharacter++;
        }
        return occurrencesOfCharacter;
    }

    //task 6
    public static String repeatEveryCharacterTwice(String text, int numberOfRepetitions) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            for (int j = 0; j < numberOfRepetitions; j++) {
                stringBuilder.append(text.charAt(i));
            }
        }
        return stringBuilder.toString();
    }

    //task 7
    public static String deleteRepeatedCharactersAndSpaces(String text) {
        char[] characters = text.toCharArray();
        StringBuilder modifiedStr = new StringBuilder();
        for (char ch : characters) {
            if (ch != ' ' && modifiedStr.indexOf(String.valueOf(ch)) == -1) {
                modifiedStr.append(ch);
            }
        }
        return modifiedStr.toString();
    }

    //task 8
    public static String calculateLargestNumberOfWord(String text) {
        String[] words = text.split(" ");
        String longestWord = "";
        for (String word: words) {
            if (word.length() > longestWord.length())
                longestWord = word;
        }
        return longestWord ;
    }

    //task 9
    public static int[] calculateLowerAndUpperCase(String text, char lowerCaseA, char lowerCaseZ,
                                                   char upperCaseA, char upperCaseZ) {
        int[] resultArray = new int[2];
        final char[] characters = text.toCharArray();
        for (char character : characters) {
            if (character >= lowerCaseA && character <= lowerCaseZ) {
                resultArray[0]++;
            }
            if (character >= upperCaseA && character <= upperCaseZ) {
                resultArray[1]++;
            }
        }
        return resultArray;
    }

    //task 10
    public static int calculateTheSentences(String text) {
        int counterSentences = 0;
        final char DOT = '.';
        final char EXCLAMATION_MARK = '!';
        final char QUESTION_MARK = '?';
        for (int i = text.indexOf(DOT); i != -1; i = text.indexOf(DOT, i + 1)) {
            counterSentences++;
        }
        for (int i = text.indexOf(EXCLAMATION_MARK); i != -1; i = text.indexOf(EXCLAMATION_MARK, i + 1)) {
            counterSentences++;
        }
        for (int i = text.indexOf(QUESTION_MARK); i != -1; i = text.indexOf(QUESTION_MARK, i + 1)) {
            counterSentences++;
        }
        return counterSentences;
    }
}
