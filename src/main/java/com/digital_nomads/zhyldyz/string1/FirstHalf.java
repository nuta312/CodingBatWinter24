package com.digital_nomads.zhyldyz.string1;

public class FirstHalf {

    public String firstHalf(String str) {
        String result = "";
        for (int i = 0; i < str.length() / 2; i++) {
            result = result + str.charAt(i);
        }
        return result;
    }

}
