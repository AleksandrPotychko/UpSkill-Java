package com.epam.arrayofcharacters;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
                    stringBuilder.append("_");
                    stringBuilder.append(Character.toLowerCase(letter));
                }
            }
            snakeCase[i] = stringBuilder.toString();
        }
        return snakeCase;
    }

    //task 2
    public static String replaceTheWords(String text) {
        String oldWord = "world";
        String newWord = "letter";
        return text.replace(oldWord, newWord);
    }
    //task 3
    public static int countDigits(String text) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (Character.isDigit(text.charAt(i))) {
                count++;
            }
        }
        return count;
    }

    //task 4
    public static int countNumbers(String text) {
        final Pattern standaloneNumber = Pattern.compile("(?<=[\\s,])\\d+(?=[\\s,])");
        Matcher matcher = standaloneNumber.matcher(text);
        int position = 0;
        int count = 0;
        while (matcher.find(position)) {
            position = matcher.end();
            count++;
        }
        return count;
    }

    //task5
    public static void removeExtraSpaces(String text) {
        System.out.println(text.trim().replaceAll("\\s{2,}", " "));
    }
}