package com.digital_nomads.shirin.string1;

public class FrontAgain {public boolean frontAgain(String str) {
    if(str.length() < 2 ){
        // if(str.substring(0 , 2).equals(str.substring(str.length()-2, str.length() -1 ))){
        return false;
    } else {
        return str.substring(0 , 2).equals(str.substring(str.length()-2));
    }



}
}
