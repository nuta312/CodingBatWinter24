package com.digital_nomads.janar.string_1;

public class NonStart {

    public String nonStart(String a, String b) {
        String str1 = a.substring(1);
        String str2 = b.substring(1);
        return str1.concat(str2);

    }

}
