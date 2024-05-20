package com.digital_nomads.nuraiym.string1;

public class firstHalf {
    public String firstHalf(String str) {
        int i = str.length() / 2;
        String firstHalf = str.substring(0, i);

        return firstHalf;
    }

}
