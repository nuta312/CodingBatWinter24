package com.digital_nomads.zhyldyz.string1;

public class LastChars {

    public String lastChars(String a, String b) {

        StringBuilder result = new StringBuilder();

        result.append(a.isEmpty() ? '@' : a.charAt(0));
        result.append(b.isEmpty() ? '@' : b.charAt(b.length() - 1));
        return result.toString();
    }
}

