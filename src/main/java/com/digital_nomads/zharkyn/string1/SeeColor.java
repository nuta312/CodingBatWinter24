package com.digital_nomads.zharkyn.string1;

public class SeeColor {

    public String seeColor(String str) {
        return str.length() > 2 && str.substring (0,3).equals("red") ? "red" :
                str.length() > 3 &&str.substring (0,4).equals("blue") ? "blue": "";
    }

}
