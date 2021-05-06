package com.epam.aggregation.starter;

import com.epam.aggregation.entity.Sentence;
import com.epam.aggregation.entity.Text;
import com.epam.aggregation.entity.Word;
import com.epam.aggregation.util.init.TextAggregator;

public class TaskLauncher {

    public static void main(String[] args) {
        Word word = new Word("Heading");
        Word word2 = new Word("new Heading");
        Sentence sentence = new Sentence("Body text");
        Sentence sentence2 = new Sentence("Body text 2");
        Sentence sentence3 = new Sentence("Body text 3");
        Sentence sentence4 = new Sentence("Body text 4");
        Text text = new Text(word, TextAggregator.createSentences(sentence,sentence2,sentence3));
        TextAggregator.printText(text);
        text.addSentence(sentence4);
        TextAggregator.printText(text);

    }
}
