package com.digital_nomads.aika.warmup1;

public class NotString {
    public String notString(String str) {
        if (str.length()>=3 && str.substring(0,3).equals("not")){
            return str;
        } else {
            return "not "+ str;
        }
    }
}
