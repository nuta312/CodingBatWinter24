package com.digital_nomads.zafura.string1;

public class LeftTwo {
    public String left2(String str) {
        return str.length()>=2 ? str.substring(2)+str.substring(0,2): str;

    }

}