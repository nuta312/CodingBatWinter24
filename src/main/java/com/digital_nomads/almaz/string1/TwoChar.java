package com.digital_nomads.almaz.string1;

public class TwoChar {
    public String twoChar(String str, int index) {
        if(index >= 0 && index <= str.length() -2){
            return str.substring(index, index +2);
        }
        else {
            return str.substring(0,2);
        }
    }

}
