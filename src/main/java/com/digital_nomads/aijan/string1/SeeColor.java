package com.digital_nomads.aijan.string1;

public class SeeColor {
    public String seeColor(String str) {
        String s = "red";
        String s1 = "blue";
        if(str.startsWith(s)){
            return s;
        }else if(str.startsWith(s1)){
            return s1;
        } return "";
    }
}
