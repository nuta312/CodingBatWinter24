package com.digital_nomads.zhyldyz.warmap1;

public class NotString {

    public String notString(String str) {

        String result = "";
        for (int i = 0; i < str.length(); i++) {
            result += str.charAt(i);
            if (result.equals("not")) {
                return str;
            }
        }
        return result = "not " + result;
    }
}
