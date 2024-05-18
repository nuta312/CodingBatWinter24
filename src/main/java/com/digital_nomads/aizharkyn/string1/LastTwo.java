package com.digital_nomads.aizharkyn.string1;

public class LastTwo {
    public static String lastTwo(String str) {
        if (str.length() > 1) {
            return str.substring(0, str.length() - 2) + str.charAt(str.length() - 1) +
                    str.charAt(str.length() - 2);
        }
        return str;
    }

}
