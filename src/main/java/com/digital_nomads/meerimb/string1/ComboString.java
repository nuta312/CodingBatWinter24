package com.digital_nomads.meerimb.string1;

public class ComboString {

    public String comboString(String a, String b) {

        if (a.length() > b.length()) {
            return b + a + b;
        }
        return a + b + a;
    }
}
