package com.digital_nomads.eldorado.str1;

public class ComboString {
    public String comboString (String a, String b){
        return (a.length()>b.length()) ? b+a+b : a+b+a;
    }
}
