package com.digital_nomads.meka.string1;

public class LastTwo {
    public String lastTwo(String str) {
        if (str.length() < 2) {
            return str;
        }
        String lastTwoChars = str.substring(str.length() - 2);
        String restOfString = str.substring(0, str.length() - 2);
        String swappedChars = lastTwoChars.charAt(1) + "" + lastTwoChars.charAt(0);
        return restOfString + swappedChars;
    }
}
