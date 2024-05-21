package com.digital_nomads.eldorado.str1;

public class Left2 {
    public String left2 (String str){
        return (str.length()<2)? str : str.substring(2)+str.substring(0,2);
    }
}
