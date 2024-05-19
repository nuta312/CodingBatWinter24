package com.digital_nomads.aika.warmup1;

public class BackAround {
    public String backAround(String str) {
        if(str.length()<=1) return str+str+str;
        String str1 = str.substring(str.length()-1);
        return str1+str+str1;

    }
}
