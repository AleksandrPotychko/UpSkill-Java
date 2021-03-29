package com.epam.stringorstringBuilder;

public class TaskLauncher {
    private final static String TEXT_FOR_THE_TASK = " world A ?12  and!   875 MILk a     345  sugar 11 or salt5world. ";
    private final static String WORD_PALINDROME = "level";
    private final static String INFORMATICS = "информатика";
    private final static String TASK_SEVEN = "abc cde def";


    public static void main(String[] args) {
        //task 1
        System.out.println(StringWorker.calculateLargestNumberOfSpaces(TEXT_FOR_THE_TASK));

        //task 2
        System.out.println(StringWorker.insertBAfterAch(TEXT_FOR_THE_TASK));

        //task 3
        System.out.println(StringWorker.isPalindrome(WORD_PALINDROME));

        //task 4
        System.out.println(StringWorker.convertInfomaticaToCake(INFORMATICS));

        //task 5
        System.out.println(StringWorker.calculateTheA(TEXT_FOR_THE_TASK));

        //task 6
        System.out.println(StringWorker.charactersDoubler(INFORMATICS));

        //task 7
        System.out.println(StringWorker.deleteRepeatedCharactersAndSpaces(TASK_SEVEN));

        //task 8
        System.out.println(StringWorker.calculateLargestNumberOfWord(TEXT_FOR_THE_TASK));

        //task 9
        StringWorker.calculateLowerAndUpperCase(TEXT_FOR_THE_TASK);

        //task 10
        System.out.println(StringWorker.calculateTheSentences(TEXT_FOR_THE_TASK));
    }
}
