package com.digital_nomads.almaz.string1;

public class ConCat {
    public String conCat(String a, String b) {
        if( a.length() >0 && b.length() >0 && a.charAt(a.length()-1) == b.charAt(0)) {
            return a+b.substring(1);
        } else {
            return a+b;
        }
    }

}
