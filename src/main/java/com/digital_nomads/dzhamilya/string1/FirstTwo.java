package com.digital_nomads.dzhamilya.string1;

public class FirstTwo {
    public String firstTwo(String str) {
        if(str.length()<2) {
            return str;
        } else {
            return str.substring(0,2);
        }
    }

}
