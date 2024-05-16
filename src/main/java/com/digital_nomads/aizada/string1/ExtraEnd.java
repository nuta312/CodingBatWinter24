package com.digital_nomads.aizada.string1;

public class ExtraEnd {


    public String extraEnd(String str) {
        if (str.length() > 2) {
            String result = str.substring(str.length() - 2);
            return result + result + result;
        }
        return str + str + str;
    }

    }
