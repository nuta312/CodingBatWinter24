package com.digital_nomads.shirin.string1;

public class MinCat {
    public String minCat(String a, String b) {
        int num1 = a.length();
        int num2 = b.length();
        int in = Math.min(num1,num2);
        return a.substring(num1 -in) + b.substring(num2 - in);
    }

}
