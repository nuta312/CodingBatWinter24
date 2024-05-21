package com.digital_nomads.zafura.string1;

public class MiddleTwo {
    public String middleTwo(String str) {
        int num = str.length()/2;
        return str.substring(num-1,num+1);
    }

}
