package com.digital_nomads.zafura.string1;

public class MiddleThree {
    public String middleThree(String str) {
        if (str.length() % 2 != 0 && str.length() >= 3) {
            int middleIndex = str.length()/2;
            return str.substring(middleIndex-1,middleIndex+2);

        }else{
            return "";
        }}
}
