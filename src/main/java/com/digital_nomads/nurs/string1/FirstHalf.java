package com.digital_nomads.nurs.string1;

public class FirstHalf {
    public String firstHalf(String str) {
        int result = str.length() / 2;
        return str.substring(0, result);
    }
}
