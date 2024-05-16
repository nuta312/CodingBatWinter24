package com.digital_nomads.janar.string_1;

public class ComboString {

    public String comboString(String a, String b) {
        String str = "";
        if(a.length() > b.length()){
            str = b + a + b;
        }else{
            str = a + b + a;
        }
        return str;
    }

}
