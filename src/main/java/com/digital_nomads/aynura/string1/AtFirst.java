package com.digital_nomads.aynura.string1;

public class AtFirst {

    public String atFirst(String str) {
        if (str.length() == 0) {
            return str + "@@";
        } else if (str.length() == 1) {
            return str + "@";
        }
        return str.substring(0, 2);
    }
}
