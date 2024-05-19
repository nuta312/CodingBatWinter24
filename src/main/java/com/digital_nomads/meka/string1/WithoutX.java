package com.digital_nomads.meka.string1;

public class WithoutX {

    public String withoutX(String str) {
        if (!str.isEmpty() && str.charAt(0) == 'x') {
            str = str.substring(1);
        }
        if (!str.isEmpty() && str.charAt(str.length() - 1) == 'x') {
            str = str.substring(0, str.length() - 1);
        }
        return str;
    }

}
