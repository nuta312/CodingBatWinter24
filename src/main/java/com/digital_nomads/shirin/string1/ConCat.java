package com.digital_nomads.shirin.string1;

public class ConCat { public String conCat(String a, String b) {

    if (a.isEmpty() || b.isEmpty()) {
        return a + b;
    }

    // Check if the last character of the first string is the same as the first character of the second string
    if (a.charAt(a.length() - 1) == b.charAt(0)) {
        // If there is a match, omit one of the characters
        return a + b.substring(1);
    } else {
        // If no match, simply concatenate the strings
        return a + b;
    }
}
}
