package com.digital_nomads.nuraiym.string1;

public class lastChars {
    public String lastChars(String a, String b) {
        char first = (a.length() > 0) ? a.charAt(0) : '@';
        char second = (b.length() > 0) ? b.charAt(b.length() - 1) : '@';

        return String.valueOf(first) + String.valueOf(second);
    }
}
