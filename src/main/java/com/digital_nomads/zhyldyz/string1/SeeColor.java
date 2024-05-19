package com.digital_nomads.zhyldyz.string1;

public class SeeColor {

    public String seeColor(String str) {
        if (str.startsWith("red")) {
            return str.substring(0, 3);
        }
        if (str.startsWith("blue")) {
            return str.substring(0, 4);
        }
        return "";
    }
}
