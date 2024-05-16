package com.digital_nomads.nargiza.string1;

public class MakeTags {

    public String makeTags(String tag, String word) {
        StringBuilder htm = new StringBuilder();
        htm.append("<").append(tag).append(">").append(word).append("</").append(tag).append(">");
        return htm.toString();
    }
}
