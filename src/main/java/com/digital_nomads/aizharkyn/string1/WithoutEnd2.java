package com.digital_nomads.aizharkyn.string1;

public class WithoutEnd2 {
    public static String withoutEnd2(String str) {
        if(str.length()<=2){
            return "";
        }
        return str.substring(1,str.length()-1);
    }

}
