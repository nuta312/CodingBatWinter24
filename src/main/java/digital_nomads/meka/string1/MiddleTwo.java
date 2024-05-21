package com.digital_nomads.meka.string1;

public class MiddleTwo {

    public String middleTwo(String str) {
        int mid1 = str.length() / 2 - 1;
        int mid2 = str.length() / 2;
        if (str.length() % 2 == 0) {
            return str.substring(mid1, mid2 + 1);
        } else {
            return str.substring(mid2, mid2 + 1);
        }
    }
}
