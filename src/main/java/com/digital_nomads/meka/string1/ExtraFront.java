package com.digital_nomads.meka.string1;

public class ExtraFront {

    public String extraFront(String str) {
        if(str.length() <= 2){
            return str + str + str;
        } else {
            return str.substring(0, 2) + str.substring(0, 2) + str.substring(0, 2);
        }
    }

}
