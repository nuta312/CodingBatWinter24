package com.digital_nomads.zharkyn.string1;

public class EndsLy {

    public boolean endsLy(String str) {
        if (str.length() < 2) return false;
        if (str.substring(str.length()-2).equals("ly")) {
            return true;
        } return false;
    }
}
