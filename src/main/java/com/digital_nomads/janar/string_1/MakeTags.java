package com.digital_nomads.janar.string_1;

public class MakeTags {

    public String makeTags(String tag, String word) {
        String str = "";
        return str + '<' + tag + '>' + word + '<' + '/' + tag + '>';
    }

}
