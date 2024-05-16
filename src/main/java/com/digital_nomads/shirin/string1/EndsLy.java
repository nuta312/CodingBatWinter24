package com.digital_nomads.shirin.string1;

public class EndsLy {
    public boolean endsLy(String str) {
    // int i = str.length();
    return str.length() < 2 ? false : str.charAt(str.length() -2) == 'l' && str.charAt(str.length() - 1) == 'y';


    // return str.endsWith("ly");
}
}
