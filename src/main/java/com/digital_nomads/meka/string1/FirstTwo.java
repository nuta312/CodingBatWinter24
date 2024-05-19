package com.digital_nomads.meka.string1;

public class FirstTwo {

    public String firstTwo(String str) {
        if (str.isEmpty()) {
            return str;
        } else if (str.length() == 1) {
            return str;
        }
        return str.substring(0,2);
    }
}
