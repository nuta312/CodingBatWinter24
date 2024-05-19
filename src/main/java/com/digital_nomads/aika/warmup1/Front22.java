package com.digital_nomads.aika.warmup1;

public class Front22 {
    public String front22(String str) {
        if (str.length()<=2) return str+str+str;
        String str1 = str.substring(0,2);
        return str1+str+str1;
    }
}
