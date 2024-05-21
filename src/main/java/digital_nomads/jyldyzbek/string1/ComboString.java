package com.digital_nomads.jyldyzbek.string1;

public class ComboString {
    public String comboString(String a, String b) {
        String result = "";
        int len = a.length();
        int len1 = b.length();
        if(len > len1){
            result = b + a + b;
        }
        else {
            result = a + b + a;
        }
        return result;
    }

}
