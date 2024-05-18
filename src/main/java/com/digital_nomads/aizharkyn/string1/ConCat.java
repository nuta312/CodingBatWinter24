package com.digital_nomads.aizharkyn.string1;

public class ConCat {

    public static  String conCat(String a, String b) {
        if(a.length() >0 && b.length() > 0 ){
            if(a.charAt(a.length()-1) == (b.charAt(0))){
                return a.substring(0, a.length()-1) +b;
            }
        }

        return a+b;
    }

}
