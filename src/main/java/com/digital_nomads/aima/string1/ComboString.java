package com.digital_nomads.aima.string1;

public class ComboString {
    public String comboString(String a, String b) {
        int aLength = a.length();
        int bLength = b.length();
        if (aLength > bLength){
            return b + a + b;
        } else {
            return a + b + a;
        }
    }
}
