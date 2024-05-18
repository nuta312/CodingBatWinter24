package com.digital_nomads.nuraiym.string1;

public class nTwice {
    public String nTwice(String str, int n) {
        if (n > str.length()) {
            throw new IllegalArgumentException("n should be less than or equal to the length of the string");
        }
        return str.substring(0, n) + str.substring(str.length() - n);
    }
}
