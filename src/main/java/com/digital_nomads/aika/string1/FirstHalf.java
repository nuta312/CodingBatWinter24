package com.digital_nomads.aika.string1;

public class FirstHalf {
    public String firstHalf(String str) {
        int halfLength = str.length() / 2;
        String firstHalf = str.substring(0, halfLength);
        return firstHalf;

    }

}
