package com.digital_nomads.aizharkyn.string1;

public class TheEnd {
    public static  String theEnd(String str, boolean front) {
        if(front){
            return str.substring(0,1);
        }
        return str.substring(str.length()-1);
    }

}