package com.digital_nomads.meka.string1;

public class AtFirst {

    public String atFirst(String str) {
        if (str.length() >= 2){
            return str.substring(0,2);
        } else if (str.isEmpty()) {
            return "@@";
        } else{
            return str + '@';
        }
    }
}
