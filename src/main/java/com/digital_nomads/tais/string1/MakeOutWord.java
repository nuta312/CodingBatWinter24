package com.digital_nomads.tais.string1;

public class MakeOutWord {

    public String makeOutWord(String out, String word) {

        return out.substring(0,out.length()/2).concat(word).concat(out.substring(out.length()/2, out.length()));
    }



}
