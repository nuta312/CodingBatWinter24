package com.digital_nomads.aizharkyn.string1;

public class AtFirst {
    public static String atFirst(String str) {
        if(str.length() == 1){
            return str + "@";
        }
        if(str.length() >= 2) {
            return str.substring(0,2);
        }
        return "@@";
    }

}
