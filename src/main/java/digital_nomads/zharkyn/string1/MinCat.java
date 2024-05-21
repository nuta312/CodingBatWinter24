package com.digital_nomads.zharkyn.string1;

public class MinCat {

    public String minCat(String a, String b) {
        return a.isEmpty() || b.isEmpty() ? "":
                a.length() == b.length() ? a + b :
                        a.length() < b.length () ? a + b.substring(b.length() - a.length()):
                                a.substring(a.length() - b.length()) + b;
    }
}
