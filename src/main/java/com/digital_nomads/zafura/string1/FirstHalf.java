package com.digital_nomads.zafura.string1;

public class FirstHalf {
    public String firstHalf(String str) {
        int r = str.length() / 2;
        return str.substring(0, r);

    }
}