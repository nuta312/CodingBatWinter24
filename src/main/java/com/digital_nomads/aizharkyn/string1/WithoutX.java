package com.digital_nomads.aizharkyn.string1;

public class WithoutX {
    public static String withoutX(String str) {
        int front = 0;
        int end = str.length();

        if (str.length() > 0 && str.charAt(0) == 'x')
            front++;

        if (str.length() > 1 && str.charAt(str.length() - 1) == 'x')
            end--;

        return str.substring(front, end);
    }

}
