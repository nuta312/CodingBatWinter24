package com.digital_nomads.shirin.string1;

public class TwoChar {public String twoChar(String str, int index) {
    if(index < 0 || index >= str.length() - 1 ){
        index = 0;
    }
    char [] i = new char [2];
    i[0] = str.charAt(index);
    i[1] = str.charAt(index +1 );

    return new String(i);
}
}
