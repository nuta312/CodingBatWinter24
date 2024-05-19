package com.digital_nomads.aijan.string1;

public class StartWord {
    public String startWord(String str, String word) {
        if (str.length() == 0 || word.length() > str.length()) {
            return "";
        } else if (str.length() == 1) {
            return str;
        } if (str.length() > word.length() && str.substring(0, word.length()).equals(word) || str.substring(1, word.length()).equals(word.substring(1))){
            return str.substring(0, word.length());
        }
        return "";
    }
}
