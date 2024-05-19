package com.digital_nomads.zafura.string1;

public class ExtraEnd {
    public String extraEnd(String str) {
        String s = str.substring(str.length()-2);
        return s+s+s;

    }

}
