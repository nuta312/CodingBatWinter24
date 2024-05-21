package com.digital_nomads.nuraiym.string1;

public class ExtraFront {
    public String extraFront(String str) {
        if (str.length() <= 2) {
            return str + str + str;
        }
        String s = str.substring(0, 2);
        return s + s + s;
    }
}
