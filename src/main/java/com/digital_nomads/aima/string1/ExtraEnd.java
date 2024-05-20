package com.digital_nomads.aima.string1;

public class ExtraEnd {
    public String extraEnd(String str) {
        String a = (str.substring(str.length()-2));
        return a + a + a;
    }
}
