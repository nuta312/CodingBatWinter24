package com.digital_nomads.janar.string_1;

public class EndsLy {

    public boolean endsLy(String str) {
        String str1 = str;
        if(str1.length() >= 2 && str1.substring(str1.length() -2).equals("ly")){
            return true;
        }else{
            return false;
        }
    }

}
