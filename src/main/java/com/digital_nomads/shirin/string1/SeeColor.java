package com.digital_nomads.shirin.string1;

public class SeeColor {public String seeColor(String str) {
    if(str.contains("red") || str.contains("blue")){
        if(str.substring(0,3).equals("red")){
            return "red";
        }else if(str.substring(0,4).equals("blue")){
            return "blue";
        }
    }
    return "";
}
}
