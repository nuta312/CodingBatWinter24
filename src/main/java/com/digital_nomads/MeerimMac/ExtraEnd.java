package com.digital_nomads.MeerimMac;

public class ExtraEnd {
    public String extraEnd(String str) {
        String name = str.substring(str.length() - 2);
        return name + name + name;
    }

}
