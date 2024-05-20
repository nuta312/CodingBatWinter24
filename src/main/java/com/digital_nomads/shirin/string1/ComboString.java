package com.digital_nomads.shirin.string1;

public class ComboString {public String comboString(String a, String b) {
    return a.length() < b.length() ? a + b + a : b + a + b;
}
}
