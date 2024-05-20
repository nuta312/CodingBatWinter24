package com.digital_nomads.zhyldyz.warmap1;

public class FrontBack {

    public String frontBack(String str) {
        String result = "";
        int x = str.length() - 1;
        if (str.length() == 2) {
            for (int n = 0; n < str.length(); n++) {
                result = str.charAt(n) + result;
            }
            return result;
        } else if (str.length() == 1 || str.length() == 0) {
            return str;
        } else {
            for (int i = 1; i < str.length() - 1; i++) {
                result += str.charAt(i);
            }
            return result = str.charAt(x) + result + str.charAt(0);
        }
    }
}
