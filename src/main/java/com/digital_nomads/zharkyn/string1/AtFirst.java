package com.digital_nomads.zharkyn.string1;

public class AtFirst {

    public String atFirst(String str) {
        if (str.length() < 2) {
            if (str.isEmpty()) {
                return "@" + "@";}
            return str +"@";
        }
        return str.substring(0,2);
    }

}
