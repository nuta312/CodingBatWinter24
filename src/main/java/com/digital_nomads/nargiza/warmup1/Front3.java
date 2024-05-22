package com.digital_nomads.nargiza.warmup1;

public class Front3 {

    public String front3(String str) {
        if ( str.length()<=3) return str+str+str;
        String str1 = str.substring(0,3);
        return str1+str1+str1;
    }
}
