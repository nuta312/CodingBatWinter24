package com.digital_nomads.nuraiym.string1;

public class withoutEnd {
    public String withoutEnd(String str) {
        return str.length() >= 2 ?str.substring(1, str.length()-1) : "";
    }

}
