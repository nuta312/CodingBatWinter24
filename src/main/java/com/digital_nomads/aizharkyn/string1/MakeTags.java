package com.digital_nomads.aizharkyn.string1;

public class MakeTags {

    public static String makeTags(String tag, String word) {
        String htmlStart = "<" +tag +">";
        String htmlEnd = "</" +tag + ">";
        String str = htmlStart + word + htmlEnd;
        return str;
    }
}
