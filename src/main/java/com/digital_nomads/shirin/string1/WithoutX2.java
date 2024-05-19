package com.digital_nomads.shirin.string1;

public class WithoutX2 {public String withoutX2(String str) {
    if (str.length() >= 2 && str.charAt(0) == 'x' && str.charAt(1) == 'x') {
        return str.substring(2);
    } else if (str.length() >= 1 && str.charAt(0) == 'x') {
        return str.substring(1);
    } else if (str.length() >= 1 && str.charAt(1) == 'x') {
        return str.charAt(0) + str.substring(2);
    }
    return str;
}
}
