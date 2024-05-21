package com.digital_nomads.nargiza.string1;

public class HasBad {

    public boolean hasBad(String str) {
        if (str.length() >= 3) {
            if (str.substring(0, 3).equals("bad")) {
                return true;
            } else if (str.length() >= 4 && str.substring(1, 4).equals("bad")) {
                return true;
            }
        }
        return false;
    }

}
