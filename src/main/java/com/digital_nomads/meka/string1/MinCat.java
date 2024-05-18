package com.digital_nomads.meka.string1;

public class MinCat {

    public  String minCat(String a, String b) {
        int lenA = a.length();
        int lenB = b.length();
        if (lenA == lenB) {
            return a + b;
        }
        if (lenA > lenB) {
            return a.substring(lenA - lenB) + b;
        }
        return a + b.substring(lenB - lenA);
    }
}
