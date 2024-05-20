package com.digital_nomads.zafura.string1;

public class ConCat {
    public String conCat(String a, String b) {
        if (a.isEmpty()) {
            return b;}
        if (b.isEmpty()) {
            return a;}
        char first= a.charAt(a.length()-1);
        char last = b.charAt(0);
        if (a.length() > 0 && b.length() > 0 && a.charAt(a.length() - 1) == b.charAt(0)) {
            return a+b.substring(1);
        }else{
            return a+b;
        }
    }
}
