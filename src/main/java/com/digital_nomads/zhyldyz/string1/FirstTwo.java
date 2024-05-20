package com.digital_nomads.zhyldyz.string1;

public class FirstTwo {

    public String firstTwo(String str) {
        if (str.isEmpty() || str.length() == 1) {
            return str;
        } else {
            return str.substring(0, 2);

        }
    }
}
