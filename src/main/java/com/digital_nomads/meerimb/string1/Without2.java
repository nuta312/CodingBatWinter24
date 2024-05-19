package com.digital_nomads.meerimb.string1;

public class Without2 {

    public String without2(String str) {
        if (str.length() >= 2 &&
                str.substring(0, 2).equals(str.substring(str.length() - 2))) {
            return str.substring(2);
        }
        return str;
    }
}
