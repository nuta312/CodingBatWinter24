package com.digital_nomads.aika.string1;

public class AtFirst {
    public String atFirst(String str) {
        if(str.length()>=2) {
            return str.substring(0,2);
        } else if  (str.length() == 1) {
            return str+"@";
        } else if (str.length() == 0) {
            return "@@";
        }
        return "";
    }
}
