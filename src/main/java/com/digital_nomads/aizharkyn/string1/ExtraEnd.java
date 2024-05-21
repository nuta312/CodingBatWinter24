package com.digital_nomads.aizharkyn.string1;

public class ExtraEnd {
    public static String extraEnd(String str) {
        String end = str.substring(str.length()-2);
        return end+end +end;
    }
}
