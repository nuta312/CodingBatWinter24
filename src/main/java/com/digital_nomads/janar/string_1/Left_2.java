package com.digital_nomads.janar.string_1;

public class Left_2 {

    public String left2(String str) {
        if(str.length() <= 2){
            return str;
        }else{
            return str.substring(2) + str.substring(0,2);
        }
    }

}
