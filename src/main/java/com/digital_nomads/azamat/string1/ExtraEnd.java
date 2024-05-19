package com.digital_nomads.azamat.string1;

public class ExtraEnd {
    public String extraEnd(String str) {
        String last = str.substring(str.length()-2, str.length());
        return last + last +last;
    }
}
