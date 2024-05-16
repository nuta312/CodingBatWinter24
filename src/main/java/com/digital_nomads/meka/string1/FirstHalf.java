package com.digital_nomads.meka.string1;

public class FirstHalf {

    public String firstHalf(String str) {
        if (str.length()% 2 == 0) {
            return str.substring(0,str.length() / 2);
        } else {
            return "Слово нечетной длины";
        }
    }

}
