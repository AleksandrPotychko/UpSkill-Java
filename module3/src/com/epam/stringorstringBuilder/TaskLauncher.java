package com.epam.stringorstringBuilder;

import java.util.Arrays;

public class TaskLauncher {
    private final static String TEXT_FOR_THE_TASK = " world A ?12  and!   875 MILk a     345  sugar 11 or salt5world. ";
    private final static String WORD_PALINDROME = "level";
    private final static String DONOR_WORD = "informatica";
    private final static String SPECIFIED_WORD = "tort";
    private final static String TASK_SEVEN = "abc cde def";
    private final static String LETTER_A = "a";
    private final static String LETTERS_AB = "ab";
    private final static int NUMBER_OF_REPETITIONS = 2;
    private final static char LOWER_CASE_A = 'a';
    private final static char LOWER_CASE_Z = 'z';
    private final static char UPPER_CASE_A = 'A';
    private final static char UPPER_CASE_Z = 'Z';




    public static void main(String[] args) {
        //task 1
        System.out.println(StringWorker.calculateLargestNumberOfSpaces(TEXT_FOR_THE_TASK));

        //task 2
        System.out.println(StringWorker.insertBAfterA(TEXT_FOR_THE_TASK, LETTER_A, LETTERS_AB));

        //task 3
        System.out.println(StringWorker.isPalindrome(WORD_PALINDROME));

        //task 4
        System.out.println(StringWorker.concatenateSpecifiedWordFromAnotherWord(DONOR_WORD, SPECIFIED_WORD));

        //task 5
        System.out.println(StringWorker.calculateTheA(TEXT_FOR_THE_TASK, LETTER_A));

        //task 6
        System.out.println(StringWorker.repeatEveryCharacterTwice(DONOR_WORD, NUMBER_OF_REPETITIONS));

        //task 7
        System.out.println(StringWorker.deleteRepeatedCharactersAndSpaces(TASK_SEVEN));

        //task 8
        System.out.println(StringWorker.calculateLargestNumberOfWord(TEXT_FOR_THE_TASK));

        //task 9
        System.out.println(Arrays.toString(StringWorker.
                calculateLowerAndUpperCase(TEXT_FOR_THE_TASK, LOWER_CASE_A, LOWER_CASE_Z, UPPER_CASE_A, UPPER_CASE_Z)));

        //task 10
        System.out.println(StringWorker.calculateTheSentences(TEXT_FOR_THE_TASK));
    }
}
