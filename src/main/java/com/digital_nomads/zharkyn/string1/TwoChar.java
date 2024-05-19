package com.digital_nomads.zharkyn.string1;

public class TwoChar {

    public String twoChar(String str, int index) {
        if (index < 0 || str.length() < (index + 2)) {
            return str.substring(0,2);
        }
        return str.substring(index, index+2);
    }

}
