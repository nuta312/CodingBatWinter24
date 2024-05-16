package com.digital_nomads.shirin.string1;

public class Right2 {public String right2(String str) {
    return str.length() >= 2 ? str.substring(str.length()-2) + str.substring(0,str.length()-2):str;
}
}
