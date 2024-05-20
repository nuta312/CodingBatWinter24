package com.digital_nomads.zhyldyz.warmap1;

public class Front3 {

    public String front3(String str) {
        String result;
        if (str.length() >= 3) {
            result = str.substring(0, 3);
        } else {
            result = str;
        }
        return result + result + result;
    }
}
