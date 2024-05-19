package com.digital_nomads.aima.string1;

public class WithoutEnd {
    public String withoutEnd(String str) {
        String mid = str.substring(1,str.length()-1);
        return mid;
    }
}
