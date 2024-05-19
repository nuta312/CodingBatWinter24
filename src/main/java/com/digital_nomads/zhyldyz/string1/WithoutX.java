package com.digital_nomads.zhyldyz.string1;

public class WithoutX {

    public String withoutX(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(0) == 'x' && str.length() != 1) {
                if (str.charAt(str.length() - 1) == 'x') {
                    return str.substring(1, str.length() - 1);
                }
                return str.substring(1);
            } else if (str.charAt(str.length() - 1) == 'x') {
                return str.substring(0, str.length() - 1);
            }
        }
        return str;
    }
}
