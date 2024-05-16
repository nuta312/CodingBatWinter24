package com.digital_nomads.alihan.string1;

public class MakeOutWord {

    public String makeOutWord(String out, String word) {
        return out.substring(0,2).concat(word).concat(out.substring(2));

    }

}
