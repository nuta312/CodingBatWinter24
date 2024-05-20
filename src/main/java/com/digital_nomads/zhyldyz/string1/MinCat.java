package com.digital_nomads.zhyldyz.string1;

public class MinCat {

    public String minCat(String a, String b) {
        if (a.length() > b.length()) {
            return a.substring(a.length() - b.length()) + b;
        }
        return a + b.substring(b.length() - a.length());
    }
}
