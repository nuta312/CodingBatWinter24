package com.digital_nomads.janar.string_1;

public class ExtraEnd {

    public String extraEnd(String str) {
        String str1 = str.substring(str.length()-2);
        return str1 + str1 + str1;
    }

}
