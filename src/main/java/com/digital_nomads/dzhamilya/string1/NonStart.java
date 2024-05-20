package com.digital_nomads.dzhamilya.string1;

public class NonStart {
    public String nonStart(String a, String b) {
        if(a.length()>1 || b.length()>1) {
            return a.substring(1, a.length()) + b.substring(1, b.length());
        } if (a.length()>=1 || b.length()>=1){
            return "";
        }
        else{
            return a + b;
        } }


}
