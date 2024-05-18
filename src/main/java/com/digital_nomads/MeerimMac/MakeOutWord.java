package com.digital_nomads.MeerimMac;


public class MakeOutWord {

    public static String makeOutWord(String out, String word) {
        String front = out.substring(0, 2);
        String back = out.substring(2);
        return front + word + back;
    }
}
