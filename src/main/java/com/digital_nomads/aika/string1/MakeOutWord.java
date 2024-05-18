package com.digital_nomads.aika.string1;

public class MakeOutWord {
    public String makeOutWord(String out, String word) {
        String str1 = out.substring(0, 2);
        String str2 = out.substring(2, 4);
        return str1 + word + str2;


    }
}
