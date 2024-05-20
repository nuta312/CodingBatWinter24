package com.digital_nomads.zafura.string1;

public class LastChars {
    public String lastChars(String a, String b) {
        char firstChar;
        if(a.length()>0 ){
            firstChar=a.charAt(0);

        }else{
            firstChar='@';

        }
        char lastChar;
        if (b.length() > 0) {
            lastChar = b.charAt(b.length() - 1);
        } else {
            lastChar = '@';
        }


        return "" + firstChar + lastChar;
    }
}
