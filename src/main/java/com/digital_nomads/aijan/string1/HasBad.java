package com.digital_nomads.aijan.string1;

public class HasBad {
    public boolean hasBad(String str) {
        return str.length() >= 3 && str.substring(0,3).equals("bad") || str.length() >= 4 && str.substring(1,4).equals("bad");
    }
}
