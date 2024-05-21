package com.digital_nomads.aizharkyn.string1;

public class ExtraFront {
    public static String extraFront(String str) {
        if(str.length()<2){
            return str +str+str;
        }
        String copy = str.substring(0,2);
        return copy+copy+copy;

    }

}
