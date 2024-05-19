package com.digital_nomads.nargiza.string1;

public class TwoChar {

    public String twoChar(String str, int index) {
        if (index >= 0 && index + 1 < str.length()) {
            return str.substring(index, index + 2);
        } else {
            return str.substring(0, 2);
        }
    }

}
