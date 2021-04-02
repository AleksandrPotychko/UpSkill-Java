package com.epam.regularexpressions;

import java.util.Arrays;

public class TaskLauncher {
    private final static String TEXT =
            "I'm going to lose weight. But I will eat potatoes.\n" +
            "Harry grows up. The young man lives in the closet under the stairsThe. Dursley are treating him badly.\n" +
            "Most of the reviews were very favorable.\n" +
            "Night Harry turns eleven. Hagrid  tells him, that he is a wizard. And will study at Hogwarts.\n" +
            "Hagrid says that the stone is guarded by teachers, including Steble. Flitwick! McGonagall? Quirrell.\n";

    public static void main(String[] args) {
        System.out.println(ChooseOneOfTheActions.sortsParagraphs(TEXT));

        System.out.println(ChooseOneOfTheActions.sortsWords(TEXT));
    }
}