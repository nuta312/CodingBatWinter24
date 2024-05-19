package com.digital_nomads.shirin.string1;

public class StartWord {public String startWord(String str, String word) {


    if (str.length() < word.length()) {
        return "";
    } String i = str.substring(1,word.length());
    if(i.equals(word.substring(1))){
        return str.substring(0 , word.length());
    }return "";
}
}
