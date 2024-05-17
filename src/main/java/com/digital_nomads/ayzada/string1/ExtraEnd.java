package com.digital_nomads.ayzada.string1;

public class ExtraEnd {
    public String extraEnd(String str) {


        String lastTwo = str.substring(str.length() - 2);

        // Return 3 copies of the last 2 characters
        return lastTwo + lastTwo + lastTwo;
    }
}