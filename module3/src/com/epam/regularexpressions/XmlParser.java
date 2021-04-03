package com.epam.regularexpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class XmlParser {
    public static String xmlAnalyzer(String xmlText) {
        StringBuilder strBuilder = new StringBuilder();
        Pattern openingTag = Pattern.compile("<\\w.+?>");
        Pattern closingTag = Pattern.compile("</\\w+>");
        Pattern tagContent = Pattern.compile(">.+?<");
        Pattern tagWithoutBody = Pattern.compile("<\\w.+?/>");

        String[] lines = xmlText.split("\n\\s*");
        for (String line : lines) {
            Matcher matcherOpeningTag = openingTag.matcher(line);
            Matcher matcherClosingTag = closingTag.matcher(line);
            Matcher matcherTagContent = tagContent.matcher(line);
            Matcher matcherTagWithoutBody = tagWithoutBody.matcher(line);
            if (matcherTagWithoutBody.find()) {
                strBuilder.append(matcherTagWithoutBody.group());
                strBuilder.append("\n");
            }
            else if (matcherOpeningTag.find()) {
                strBuilder.append(matcherOpeningTag.group());
                strBuilder.append("\n");
            }
            if (matcherTagContent.find()) {
                strBuilder.append(matcherTagContent.group().substring(1));
                strBuilder.append("\n");
            }
            if (matcherClosingTag.find()) {
                strBuilder.append(matcherClosingTag.group());
                strBuilder.append("\n");
            }
        }
        return strBuilder.toString();
    }
}