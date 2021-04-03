package com.epam.regularexpressions;

import com.epam.stringorstringBuilder.XmlParser;


public class TaskLauncher {
    private final static String TEXT =
            "I'm going to lose weight. But I will eat potatoes.\n" +
            "Harry grows up. The young man lives in the closet under the stairsThe. Dursley are treating him badly.\n" +
            "Most of the reviews were very favorable.\n" +
            "Night Harry turns eleven. Hagrid  tells him, that he is a wizard. And will study at Hogwarts.\n" +
            "Hagrid says that the stone is guarded by teachers, including Steble. Flitwick! McGonagall? Quirrell.\n";

    private final static String XML =
    "   <notes>\n" +
    "    <note id = \"1\">\n" +
    "     <to>Вася</to>\n" +
    "     <from>Света</from>\n" +
    "     <heading>Напоминание</heading>\n" +
    "     <body>Позвони мне завтра!</body>\n" +
    "    </note>\n" +
    "    <note id = \"2\">\n" +
    "     <to>Петя</to>\n" +
    "     <from>Маша</from>\n" +
    "     <heading>Важное напоминание</heading>\n" +
    "     <body/>\n" +
    "    </note>\n" +
    "   </notes>\n";

    public static void main(String[] args) {
        System.out.println(ChooseOneOfTheActions.sortsParagraphs(TEXT));
        System.out.println(ChooseOneOfTheActions.sortsWords(TEXT, false));

        System.out.println(XmlParser.xmlAnalyzer(XML));
    }
}