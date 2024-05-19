package com.digital_nomads.aida.string1;

public class TheEnd {

    public String theEnd(String str, boolean front) {
        if (str.length() > 1 && front == true){
            return str.substring(0,1);
        }
        return str.substring(str.length()-1);

    }

}
