package com.digital_nomads.janar.string_1;

public class Right_2 {

    public String right2(String str) {
        if(str.length() <= 2){
            return str;
        }else{
            return str.substring(str.length()-2) + str.substring(0,str.length()-2);
        }
    }

}
