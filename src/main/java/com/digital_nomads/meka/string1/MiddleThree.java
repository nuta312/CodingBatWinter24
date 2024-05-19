package com.digital_nomads.meka.string1;

public class MiddleThree {

    public String middleThree(String str) {
        int a = str.length() / 2 - 1;
        int b = str.length() / 2;
        int c = str.length()/ 2 + 2;
        if (str.length() % 2 != 0) {
            return str.substring(a, c);
        }
        return str.substring(str.length());
    }
}
