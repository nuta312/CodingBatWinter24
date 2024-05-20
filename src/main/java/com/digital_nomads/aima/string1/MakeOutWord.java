package com.digital_nomads.aima.string1;

public class MakeOutWord {
    public String makeOutWord(String out, String word) {
        String i = out.substring(0,2);
        String j = out.substring(2,4);
        return  i + word + j;
    }
}
