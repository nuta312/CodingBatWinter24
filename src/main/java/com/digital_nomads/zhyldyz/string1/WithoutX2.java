package com.digital_nomads.zhyldyz.string1;

public class WithoutX2 {

    public String withoutX2(String str) {

        if (str.length() > 1 && str.substring(0, 2).equals("xx")) {
            return str.substring(2);
        } else if (str.length() > 0 && str.charAt(0) == 'x') {
            return str.substring(1);
        } else if (str.length() > 0 && str.charAt(1) == 'x') {
            return str.substring(0, 1) + str.substring(2);
        }
        return str;
    }

}
