package com.epam.arrayofcharacters;


public class BusinessWorker {
    //task 1
    public static String[] convertTitlesToSnakeCase(String[] camelCase) {
        String[] snakeCase = new String[camelCase.length];
        for (int i = 0; i < snakeCase.length; i++) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int j = 0; j < camelCase[i].length(); j++) {
                char letter = camelCase[i].toCharArray()[j];
                if (Character.isLowerCase(letter)) {
                    stringBuilder.append(letter);
                } else {
                    stringBuilder.append("_").append(Character.toLowerCase(letter));
                }
            }
            snakeCase[i] = stringBuilder.toString();
        }
        return snakeCase;
    }

    //task 2
    public static String replaceTheWords(String text) {
        StringBuilder strBuilder = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            if (i + 3 < text.length() && text.charAt(i) == 'w' && text.charAt(i + 1) == 'o' && text.charAt(i + 2) == 'r'
                    && text.charAt(i + 3) == 'd') {
                strBuilder.append("letter");
                i += 3;
            } else {
                strBuilder.append(text.charAt(i));
            }
        }
        return strBuilder.toString();
    }

    //task 3
    public static int countDigits(String text, int asciiNumberOfFirstDigit, int asciiNumberOfLastDigit) {
        int counterOfDigits = 0;
        final char[] characters = text.toCharArray();
        for (char ch : characters) {
            if (ch >= asciiNumberOfFirstDigit && ch <= asciiNumberOfLastDigit) {
                counterOfDigits++;
            }
        }
        return counterOfDigits;
    }

    //task 4
    public static int countNumbers(String text) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
                if (isDigit(text.charAt(i))) {
                    if (i == text.length() - 1 || !isDigit(text.charAt(i + 1))) {
                        count++;
                    }
                    if (isDigit(text.charAt(i)) && text.
                            charAt(i + 1) == '.' || text.charAt(i + 1) == ',' && isDigit(text.charAt(i + 2))) {
                        count--;
                    }
                }
            }
            return count;
        }

        private static boolean isDigit(char ch) {
        boolean isDigit = false;
            int ASCII_NUMBER_OF_FIRST_DIGIT = 48;
            int ASCII_NUMBER_OF_LAST_DIGIT = 57;
                if (ch >= ASCII_NUMBER_OF_FIRST_DIGIT && ch <= ASCII_NUMBER_OF_LAST_DIGIT){
                    isDigit = true;
                }
            return isDigit;
        }

    //task5
    public static String removeExtraSpaces(String text) {
        StringBuilder strBuilder = new StringBuilder();
        String line = text.trim();
        boolean isSpace = false;
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == ' ') {
                if (!isSpace) {
                    strBuilder.append(" ");
                }
                isSpace = true;
            } else {
                strBuilder.append(line.charAt(i));
                isSpace = false;
            }
        }
        return strBuilder.toString();
    }
}