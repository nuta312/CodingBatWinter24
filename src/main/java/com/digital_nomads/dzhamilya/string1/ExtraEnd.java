package com.digital_nomads.dzhamilya.string1;

public class ExtraEnd {
    public String extraEnd(String str) {
    if (str.length()<= 2){
        return  str + str + str;
    } else
    {
        return str.substring(str.length()-2) + str.substring(str.length()-2) + str.substring(str.length()-2) ;
    }
}

}
