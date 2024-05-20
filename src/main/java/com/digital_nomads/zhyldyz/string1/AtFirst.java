package com.digital_nomads.zhyldyz.string1;

public class AtFirst {

    public String atFirst(String str) {
        String first = "";
        if (str.length() == 1) {
            return first = str + "@";
        }
        if (str.length() > 1) {
            return str.substring(0, 2);
        }
        return str = "@@";

    }
}
