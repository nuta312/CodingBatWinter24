package com.digital_nomads.almaz.string1;

public class ExtraEnd {
    public String extraEnd(String str) {
        String last = str.substring(str.length()-2);
        return last + last + last;
    }
}
