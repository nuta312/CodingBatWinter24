package com.digital_nomads.aizharkyn.string1;

public class Mincat {
    public static String minCat(String a, String b) {
        if(a.length()>b.length()){
            return a.substring(a.length()-b.length())+b;
        }
        if(b.length()>a.length()){
            return a + (b.substring(b.length()-a.length()));
        }
        return a+b;
    }

}
