package com.digital_nomads.zhyldyz.warmap1;

public class MissingChar {

    public String missingChar(String str, int n) {

        StringBuilder obj = new StringBuilder(str);
        return obj.deleteCharAt(n).toString();
    }
}
