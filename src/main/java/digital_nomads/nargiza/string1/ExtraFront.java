package com.digital_nomads.nargiza.string1;

public class ExtraFront {

    public String extraFront(String str) {
        String result = str.length() >= 2 ? str.substring(0, 2) : str;
        return result + result + result;

    }
}
