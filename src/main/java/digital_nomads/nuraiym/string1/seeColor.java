package com.digital_nomads.nuraiym.string1;

public class seeColor {
    public String seeColor(String str) {
        if (str.length() <= 2) {
            return "";
        }
        if (str.substring(0, 3).equals("red")) {
            return "red";
        }
        if (str.length() >= 4 && str.substring(0, 4).equals("blue")) {
            return "blue";
        }
        return "";
    }
}
