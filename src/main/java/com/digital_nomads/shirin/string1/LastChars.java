package com.digital_nomads.shirin.string1;

public class LastChars {public String lastChars(String a, String b) {
    char i = a.isEmpty() ? '@' : a.charAt(0);
    char j= b.isEmpty() ? '@'  : b.charAt(b.length()-1);
    return "" + i + j;
}
}
