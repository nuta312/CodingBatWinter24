package com.digital_nomads.zharkyn.string1;

public class MiddleThree {

    public String middleThree(String str) {
        int num = str.length()/2;
        return str.substring(num-1, num +2);
    }
}
