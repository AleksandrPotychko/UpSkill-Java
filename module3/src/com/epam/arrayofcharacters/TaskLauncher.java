package com.epam.arrayofcharacters;

import java.util.Arrays;

public class TaskLauncher {
    private static final int ASCII_NUMBER_OF_FIRST_DIGIT = 48;
    private static final int ASCII_NUMBER_OF_LAST_DIGIT = 57;

    private static final String[] CAMEL_CASE = {"oneCase", "twoCase", "toGoHome", "starWars", "dartMoll", "dartRevan",
            "masterObiVanKenobi"};
    private static final String TEXT_FOR_THE_TASK = " word,77   997  and   875 milk a   345  sugar 11  or salt,  5  " +
            "word ";

    public static void main(String[] args) {
        //task 1
        System.out.println(Arrays.toString(BusinessWorker.convertTitlesToSnakeCase(CAMEL_CASE)));

        //task 2
        System.out.println(BusinessWorker.replaceTheWords(TEXT_FOR_THE_TASK));

        //task 3
        System.out.println(BusinessWorker.
                countDigits(TEXT_FOR_THE_TASK, ASCII_NUMBER_OF_FIRST_DIGIT, ASCII_NUMBER_OF_LAST_DIGIT));

        //task 4
        System.out.println(BusinessWorker.countNumbers(TEXT_FOR_THE_TASK));

        //task 5
        System.out.println(BusinessWorker.removeExtraSpaces(TEXT_FOR_THE_TASK));

    }
}
