package com.digital_nomads.aijan.string1;

public class EndsLy {
    public boolean endsLy(String str) {
        return str.length() >= 2 && str.substring(str.length() - 2).equals("ly");
    }
}
