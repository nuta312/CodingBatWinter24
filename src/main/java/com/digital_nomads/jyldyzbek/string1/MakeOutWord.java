package com.digital_nomads.jyldyzbek.string1;

public class MakeOutWord {

    public String makeOutWord(String out, String word) {
        String str = out.substring(0, 2);
        String str1 = out.substring(2);
        return str + word + str1;
    }

}
