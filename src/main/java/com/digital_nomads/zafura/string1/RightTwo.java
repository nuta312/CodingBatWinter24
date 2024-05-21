package com.digital_nomads.zafura.string1;

public class RightTwo {
    public String right2(String str) {
        return str.length()>=2 ? str.substring(str.length() -2) + str.substring(0,str.length()-2) : str;

    }

}
