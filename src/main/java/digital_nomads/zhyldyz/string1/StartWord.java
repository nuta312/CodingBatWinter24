package com.digital_nomads.zhyldyz.string1;

public class StartWord {

    public String startWord(String str, String word) {
        if (str.length() < word.length()) {
            return "";
        }
        String result = str.substring(0, word.length());
        if (result.substring(1).equals(word.substring(1))) {
            return result;
        }
        return "";
    }
}
