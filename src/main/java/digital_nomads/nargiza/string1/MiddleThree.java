package com.digital_nomads.nargiza.string1;

public class MiddleThree {

    public String middleThree(String str) {
        int a = str.length() / 2;
        return str.substring(a - 1, a + 2);
    }
}
