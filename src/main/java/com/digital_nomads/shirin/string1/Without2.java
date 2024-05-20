package com.digital_nomads.shirin.string1;

public class Without2 {public String without2(String str) {

    return str.length() >= 2 && str.substring(0, 2).equals(str.substring(str.length() - 2))
            ? str.substring(2)
            : str;
}
}
