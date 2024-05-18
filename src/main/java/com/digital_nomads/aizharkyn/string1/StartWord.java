package com.digital_nomads.aizharkyn.string1;

public class StartWord {
    public static String startWord(String str, String word) {
        if(str.length() >= word.length() &&  word.substring(1).equals(str.substring(1,word.length()))){
            return str.substring(0, word.length());
        }
        return "";
    }

}
