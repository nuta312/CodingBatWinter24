package com.digital_nomads.zhyldyz.string1;

public class TwoChar {
    public String twoChar(String str, int index) {
        if (str.length() - 2 < index || index < 0) {
            index = 0;
        }
        return str.substring(index, index + 2);
    }

}
