package com.digital_nomads.nuraiym.string1;

public class comboString {
    public String comboString(String a, String b) {
        String shorter = a.length() < b.length() ? a : b;
        String longer = a.length() >= b.length() ? a : b;
        return shorter + longer + shorter;
    }
}
