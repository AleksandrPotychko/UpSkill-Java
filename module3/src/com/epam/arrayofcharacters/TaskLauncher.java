package com.epam.arrayofcharacters;

import java.util.Arrays;

public class TaskLauncher {

    public static String[] CAMEL_CASE = {"oneCase", "twoCase", "toGoHome", "starWars", "dartMoll", "dartRevan",
            "masterObiVanKenobi"};
    public static String TEXT_FOR_THE_TASK = " world,   12  and   875 milk a   345  sugar 11  or salt,  5  world ";

    public static void main(String[] args) {
        //task 1
        System.out.println(Arrays.toString(BusinessWorker.convertTitlesToSnakeCase(CAMEL_CASE)));

        //task 2
        System.out.println(BusinessWorker.replaceTheWords(TEXT_FOR_THE_TASK));

        //task 3
        System.out.println(BusinessWorker.countDigits(TEXT_FOR_THE_TASK));

        //task 4
        System.out.println(BusinessWorker.countNumbers(TEXT_FOR_THE_TASK));

        //task 5
        BusinessWorker.removeExtraSpaces(TEXT_FOR_THE_TASK);

    }
}
