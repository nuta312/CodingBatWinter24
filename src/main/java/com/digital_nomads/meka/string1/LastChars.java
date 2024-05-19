package com.digital_nomads.meka.string1;

public class LastChars {

    public String lastChars(String a, String b) {
        char first;
        if (a.length() > 0) {
            first = a.charAt(0);
        } else {
            first = '@';
        }
        char last;
        if (b.length() > 0) {
            last = b.charAt(b.length() - 1);
        } else {
            last = '@';
        }
        return "" + first + last;
    }
}
