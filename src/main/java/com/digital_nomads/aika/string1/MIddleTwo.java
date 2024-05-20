package com.digital_nomads.aika.string1;

public class MIddleTwo {
    public String middleTwo(String str) {
        int word = str.length() / 2;
        return str.substring(word -1,word +1);
    }
}
