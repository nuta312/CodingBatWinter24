package com.digital_nomads.aizharkyn.string1;

public class WithoutX2 {
    public static String withoutX2(String str) {
        if (str.length() < 2)
            return "";
        else
            return (str = str.substring(0, 2).replace("x", "")+str.substring(2));
    }

}
