package com.digital_nomads.aika.warmup1;

public class StartOz {
    public String startOz(String str) {
        String str1 = "";
        if (str.length() >= 1 && str.charAt(0) == 'o') {
            str1 = str1 +str.charAt(0); }
        if (str.length() >= 2 && str.charAt(1) == 'z') {
            str1 = str1 +str.charAt(1);
        }
        return str1;
    }
}
