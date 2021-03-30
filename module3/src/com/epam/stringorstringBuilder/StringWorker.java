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
    public static String convertInformaticaToTort(String word) {
        final char LETTER_T = 't';
        final char LETTER_O = 'o';
        final char LETTER_R = 'r';
        StringBuilder result = new StringBuilder();
        final char[] characters = word.toCharArray();
        for (char character : characters) {
            if (character == LETTER_T) {
                result.append(character);
            }
        }
        for (char character : characters) {
            if (character == LETTER_O) {
                result.append(character);
            }
        }
        for (char character : characters) {
            if (character == LETTER_R) {
                result.append(character);
            }
        }
        for (char character : characters) {
            if (character == LETTER_T) {
                result.append(character);
            }
        }
        return result.toString();
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
    public static String repeatEveryCharacterTwice(String text) {
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
    public static int[] calculateLowerAndUpperCase(String text) {
        int[] resultArray = new int[2];
        final char LOWER_CASE_A = 'a';
        final char LOWER_CASE_Z = 'z';
        final char UPPER_CASE_A = 'A';
        final char UPPER_CASE_Z = 'Z';
        final char[] characters = text.toCharArray();
        for (char character : characters) {
            if (character >= LOWER_CASE_A && character <= LOWER_CASE_Z) {
                resultArray[0]++;
            }
            if (character >= UPPER_CASE_A && character <= UPPER_CASE_Z) {
                resultArray[1]++;
            }
        }
        return resultArray;
    }

    //task 10
    public static int calculateTheSentences(String text) {
        int occurrencesOfCharacter = 0;
        final char DOT = '.';
        final char EXCLAMATION_MARK = '!';
        final char QUESTION_MARK = '?';
        for (int i = text.indexOf(DOT); i != -1; i = text.indexOf(DOT, i + 1)) {
            occurrencesOfCharacter++;
        }
        for (int i = text.indexOf(EXCLAMATION_MARK); i != -1; i = text.indexOf(EXCLAMATION_MARK, i + 1)) {
            occurrencesOfCharacter++;
        }
        for (int i = text.indexOf(QUESTION_MARK); i != -1; i = text.indexOf(QUESTION_MARK, i + 1)) {
            occurrencesOfCharacter++;
        }
        return occurrencesOfCharacter;
    }
}