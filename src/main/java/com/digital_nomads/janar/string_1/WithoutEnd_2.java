package com.digital_nomads.janar.string_1;

public class WithoutEnd_2 {

    public String withouEnd2(String str) {
        String str1 = str;
        if (str.length() >= 2){
            return (str.substring(1, str.length()-1));
        }else{
            return "";
        }
    }

}
