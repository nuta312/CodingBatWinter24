package com.digital_nomads.aima.string1;

public class FirstTwo {
    public String firstTwo(String str) {
        if (str.length() < 2){
            return str;
        }
        String firstTwo = str.substring(0,2);
        return firstTwo;
    }
}
