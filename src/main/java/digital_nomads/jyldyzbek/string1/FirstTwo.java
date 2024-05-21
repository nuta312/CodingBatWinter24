package com.digital_nomads.jyldyzbek.string1;

public class FirstTwo {
    public String firstTwo(String str) {
        if(str.length() < 2) return str;
        String str1 = str.substring(0,2);
        return str1;
    }

}
