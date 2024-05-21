package com.digital_nomads.aizharkyn.string1;

public class MiddleThree {
    public static String middleThree(String str) {
        int middle = str.length()/2;
        return str.substring(middle -1 , middle + 2);
    }

}
