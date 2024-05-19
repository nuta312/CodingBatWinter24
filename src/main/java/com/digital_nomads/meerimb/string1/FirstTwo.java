package com.digital_nomads.meerimb.string1;

public class FirstTwo {
    public String firstTwo(String str) {

        if (str.length() > 2) {
            return str.substring(0, 2);
        }
        return str;
    }
}
