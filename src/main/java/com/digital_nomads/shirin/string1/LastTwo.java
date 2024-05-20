package com.digital_nomads.shirin.string1;

public class LastTwo {public String lastTwo(String str) {

    if(str.length() <= 1 ){
        return str;
    }else{
        String a = str.substring(str.length() -2, str.length() -1);
        String b = str.substring(str.length() -1);
        return str.substring(0 , str.length() -2) + b + a;
    }
}
}
