package com.digital_nomads.s1rgak.string1;

public class WithoutX2 {
    public String withoutX2(String str) {
        String res="";
        for (int i=0;i<str.length();i++){
            if (i<=1&&(str.substring(i,i+1).equals("x"))){
            } else res+=str.charAt(i);
        } return res;
    }
}
