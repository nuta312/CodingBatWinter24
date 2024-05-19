package com.digital_nomads.aima.string1;

public class MakeTags {
    public String makeTags(String tag, String word) {
        return "<"  + tag + ">" + word + "</" + tag + ">";
    }
}
