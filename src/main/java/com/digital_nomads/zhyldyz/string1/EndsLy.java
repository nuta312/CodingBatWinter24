package com.digital_nomads.zhyldyz.string1;

public class EndsLy {

    public boolean endsLy(String str) {

        if (str.length() >= 2 && str.substring(str.length() - 2).equals("ly")) {
            return true;
        }
        return false;
    }

}
