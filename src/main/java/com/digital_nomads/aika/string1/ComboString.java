package com.digital_nomads.aika.string1;

public class ComboString {
    public String comboString(String a, String b) {
        int a1 = a.length();
        int b1 = b.length();
        if (a1 > b1){
            return b + a + b;
        } else {
            return a + b + a;
        }
    }
}
