package com.digital_nomads.aijan.string1;

public class ExtraEnd {
    public String extraEnd(String str) {
        return str.substring(str.length()-2, str.length()) + str.substring(str.length()-2, str.length()) + str.substring(str.length()-2, str.length());
    }
}
