package com.digital_nomads.shirin.string1;

public class ExtraEnd {
    public String extraEnd(String str) {
        String j = str.substring( str.length()-2);
        return j+j+j;
    }
}
