package com.digital_nomads.aika.string1;

public class WithoutEnd2 {
    public String withouEnd2(String str) {
        if (str.length()<2) {
            return "";
        } else {
            return str.substring(1,str.length()-1);
        }
    }
}
