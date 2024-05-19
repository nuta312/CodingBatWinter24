package com.digital_nomads.meerimb.string1;

public class SeeColor {

    public String seeColor(String str) {
        if (str.startsWith("red")) {
            return "red";
        }
        if (str.startsWith("blue")) {
            return "blue";
        }
        return "";
    }
}
