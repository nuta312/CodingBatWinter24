package com.digital_nomads.aima.string1;

public class LeftTwo {
    public String leftTwo(String str) {
        String leftTwo = str.substring(0,2);
        return str.substring(2) + leftTwo;
    }
}
