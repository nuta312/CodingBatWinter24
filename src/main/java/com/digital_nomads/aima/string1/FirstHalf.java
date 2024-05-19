package com.digital_nomads.aima.string1;

public class FirstHalf {
    public String firstHalf(String str) {
        int firstHalf = str.length() / 2;
        String str1 = str.substring(0,firstHalf);
        return str1;
    }
}
