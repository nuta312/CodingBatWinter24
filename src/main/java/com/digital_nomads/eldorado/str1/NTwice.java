package com.digital_nomads.eldorado.str1;

public class NTwice {
    public String nTwice(String s, int n){
        return s.substring(0,n)+s.substring(s.length()-n);
    }
}
