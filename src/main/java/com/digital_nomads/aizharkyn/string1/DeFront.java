package com.digital_nomads.aizharkyn.string1;

public class DeFront {
    public static String deFront(String str) {
        if (str.substring(0,2).equals("ab")){
            return str;
        }
        else if(str.charAt(0) == 'a'){
            return str.substring(0,1) + str.substring(2);
        }else if (str.charAt(1) == 'b'){
            return str.substring(1);
        }else
            return str.substring(2);
    }

}
