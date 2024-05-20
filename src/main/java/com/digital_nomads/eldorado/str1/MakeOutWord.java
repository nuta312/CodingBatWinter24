package com.digital_nomads.eldorado.str1;

public class MakeOutWord {
    /*

Given an "out" string length 4, such as "<<>>", and a word, return a new string where the word is in the middle
 of the out string, e.g. "<<word>>". Note: use str.substring(i, j) to extract the String starting at index i and
 going up to but not including index j.

     */

    public String makeOutWords(String a, String b){
        return a.substring(0,a.length()/2)+ b + a.substring(a.length()/2);
    }
}
