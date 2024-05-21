package com.digital_nomads.aizharkyn.string1;

public class ComboString {
    public static String comboString(String a, String b) {
        if(a.length()> b.length()){
            return b + a +b;
        }
        return a +b +a;
    }
}
