package com.digital_nomads.aijan.string1;

public class ConCat {
    public String conCat(String a, String b) {
        if (a.length() != 0 && b.length() != 0 && a.substring(a.length()-1).equals(b.substring(0,1))){
            return a + b.substring(1);
        }return a + b;
    }
}
