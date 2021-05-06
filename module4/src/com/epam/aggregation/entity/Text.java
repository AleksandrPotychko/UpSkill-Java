package com.epam.aggregation.entity;


import java.util.List;
import java.util.Objects;

public class Text {
    private Word headline;
    private List<Sentence> body;

    public Text(Word headline, List<Sentence> body) {
        this.headline = headline;
        this.body = body;
    }

    public void addSentence(Sentence sentence){
        this.body.add(sentence);
    }

    public Word getHeadline() {
        return headline;
    }

    public void setHeadline(Word headline) {
        this.headline = headline;
    }

    public List<Sentence> getBody() {
        return body;
    }

    public void setBody(List<Sentence> body) {
        this.body = body;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Text text = (Text) o;
        return Objects.equals(headline, text.headline) && Objects.equals(body, text.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(headline, body);
    }

    @Override
    public String toString() {
        return "Text :" + "\n" +
                headline + "\n" +
                body +
                '.';
    }
}
