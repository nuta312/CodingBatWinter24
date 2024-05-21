package com.digital_nomads.aika.warmup1;

public class StartHi {
    public boolean startHi(String str) {
        if(str.length() <= 1) return false;
        return (str.substring(0,2)).equals("hi");
    }
}
