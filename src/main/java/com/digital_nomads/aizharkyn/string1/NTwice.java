package com.digital_nomads.aizharkyn.string1;

public class NTwice {


    public static String nTwice(String str, int n) {

        return str.substring(0,n)+str.substring(str.length()-n);
    }

}
