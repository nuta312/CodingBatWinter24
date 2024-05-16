package com.digital_nomads.janar.string_1;

public class FirstTwo {

    public String firstTwo(String str) {
        if (str.length() >= 2 ){
            return str.substring(0, 2);
        } else {
            return str;
        }
    }

}
