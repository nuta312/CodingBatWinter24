package com.digital_nomads.nargiza.string1;

public class ExtraEnd {

    public String extraEnd(String str) {
        String str2 = str.substring(str.length() - 2);
        String result = str2 + str2 + str2;
        return result;
    }
}
