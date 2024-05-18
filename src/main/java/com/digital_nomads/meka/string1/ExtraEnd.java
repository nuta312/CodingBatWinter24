package com.digital_nomads.meka.string1;

public class ExtraEnd {

    public String extraEnd(String str) {
        return str.substring(str.length() - 2) + str.substring(str.length() - 2) + str.substring(str.length() - 2);
    }

}
