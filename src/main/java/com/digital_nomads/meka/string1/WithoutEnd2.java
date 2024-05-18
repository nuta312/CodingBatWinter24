package com.digital_nomads.meka.string1;

public class WithoutEnd2 {

    public String withouEnd2(String str) {
        if (str.isEmpty()) {
            return str;
        } else if (str.length() == 1){
            return "";
        }
        return str.substring(1,str.length() - 1);
    }
}
