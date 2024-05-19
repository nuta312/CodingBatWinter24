package com.digital_nomads.zharkyn.string1;

public class LastChars {

    public String lastChars(String a, String b) {
        if (a.isEmpty()) a = "@";
        if (b.isEmpty()) b = "@";
        return a.substring(0,1) + b.substring(b.length()-1);
    }

}
