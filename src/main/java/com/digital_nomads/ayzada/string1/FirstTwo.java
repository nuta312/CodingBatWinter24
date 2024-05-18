package com.digital_nomads.ayzada.string1;

public class FirstTwo {
    public  String firstTwo(String str){
     if (str.length() < 2) {
        return str;
    } else {
        // Return the first two characters using substring
        return str.substring(0, 2);
    }
}
}
