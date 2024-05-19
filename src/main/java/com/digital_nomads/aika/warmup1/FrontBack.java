package com.digital_nomads.aika.warmup1;

public class FrontBack {
    public String frontBack(String str) {
        if(str.length() <=1) return str;
        String str1 = str.substring(1,str.length()-1);
        return str.charAt(str.length()-1)+str1+str.charAt(0);
    }
}
