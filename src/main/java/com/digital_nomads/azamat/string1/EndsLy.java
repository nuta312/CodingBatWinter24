package com.digital_nomads.azamat.string1;

public class EndsLy {
    public boolean endsLy(String str) {
        if(str.length()<2){
            return false;
        }
        if (str.substring(str.length()-2, str.length()).equals ("ly")){
            return true;
        } return false;
    }

}
