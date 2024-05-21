package com.digital_nomads.nargiza.string1;

public class SeeColor {

    public String seeColor(String str) {
        if (str.startsWith("red")) {
            return "red";
        } else if (str.startsWith("blue")) {
            return "blue";
        } else {
            return "";
        }
    }
}
