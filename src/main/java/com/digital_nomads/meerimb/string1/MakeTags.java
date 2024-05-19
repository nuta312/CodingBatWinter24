package com.digital_nomads.meerimb.string1;

public class MakeTags {
    public String makeTags(String tag, String word) {

        String startTag = "<" + tag + ">";
        String endTag = "</" + tag + ">";
        String result = startTag + word + endTag;
        return result;
    }
}
