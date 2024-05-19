package com.digital_nomads.aynura.string1;

public class MakeOutWord {

    public String makeOutWord(String out, String word) {
        return out.substring(0, out.length()/2) + word + out.substring(out.length()/2);
    }
}
