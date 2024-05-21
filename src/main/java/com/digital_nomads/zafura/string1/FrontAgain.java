package com.digital_nomads.zafura.string1;

public class FrontAgain {
    public boolean frontAgain(String str) {
        if (str.length() == 1|| str.length()==0) {
            return false;
        }
        if(str.substring(0,2).equals(str.substring(str.length()-2))){
            return true;
        }
        return false;
    }
}
