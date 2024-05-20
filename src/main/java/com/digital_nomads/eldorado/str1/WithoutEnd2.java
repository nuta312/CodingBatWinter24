package com.digital_nomads.eldorado.str1;

public class WithoutEnd2 {
    public String withoutEnd2 (String str){
        if (str.length() <= 2){
            return "";
        }else {
            return str.substring(1,str.length()-1);
        }
    }
}
