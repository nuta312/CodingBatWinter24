package com.digital_nomads.nuraiym.string1;

public class ExtraEnd {
    public String extraEnd(String str) {
        String s = str.substring(str.length()-2, str.length());
        return s+s+s;
    }

}
