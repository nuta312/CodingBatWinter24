package com.digital_nomads.eldorado.str1;

public class WithoutEnd {
    /*

Given a string, return a version without the first and last char,
 so "Hello" yields "ell". The string length will be at least 2.
     */
    public String witoutEnd (String str){
        return str.substring(1,str.length()-1);
    }
}
