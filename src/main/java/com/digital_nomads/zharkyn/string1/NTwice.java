package com.digital_nomads.zharkyn.string1;

public class NTwice {

    public String nTwice(String str, int n) {
        return str.substring(0,n) + str.substring(str.length()-n);
    }

}
