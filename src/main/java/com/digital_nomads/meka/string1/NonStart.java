package com.digital_nomads.meka.string1;

public class NonStart {

    public String nonStart(String a, String b) {
        String str = a.substring(1).concat(b.substring(1));
        return str;
    }
}
