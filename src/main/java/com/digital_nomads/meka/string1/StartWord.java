package com.digital_nomads.meka.string1;

public class StartWord {

    public String startWord(String str, String word) {
        if (!word.isEmpty()) {
            if (str.length() >= word.length()) {
                if (str.substring(1, word.length()).equals(word.substring(1))) {
                    return str.substring(0, word.length());
                }
            }
        }

        return "";
    }
}
