package com.digital_nomads.nargiza.string1;

public class MiddleTwo {

    public String middleTwo(String str) {
        int a = str.length();
        int b = a / 2;
        if (a % 2 == 0) {

            return str.substring(b - 1, b + 1);
        } else {

            return str.substring(b, b + 1);
        }
    }
}
