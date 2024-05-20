package com.digital_nomads.zafura.string1;

public class ExtraFront {
    public String extraFront(String str) {
        if(str.length()<=1){
            return str+str+str;
        }
        if(str.length()>=1){

        }
        return str.substring(0,2)+str.substring(0,2)+str.substring(0,2);

    }
}
