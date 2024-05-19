package com.digital_nomads.shirin.string1;

public class ExtraFront {
    public String extraFront(String str) {
        return str.length()>=2 ? str.substring(0,2)+str.substring(0,2)+str.substring(0,2) :str+str+str;
    }
}
