package com.digital_nomads.jyldyzbek.string1;

public class MakeTags {
    public String makeTags(String tag, String word) {
        String str = "<" + tag + ">";
        String str1 = "</" + tag + ">";
        return str + word + str1;
    }
}
