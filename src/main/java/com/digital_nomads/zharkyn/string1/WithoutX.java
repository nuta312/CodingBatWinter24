package com.digital_nomads.zharkyn.string1;

public class WithoutX {

    /*Учитывая строку, если первый или последний символ равен «x», верните строку без этих символов «x»,
     в противном случае верните строку без изменений.*/

    public String withoutX(String str) {
        if (str.length() < 2) return "";
        if (str.charAt(0) == 'x') {
            str = str.substring(1); }
        if (str.charAt(str.length()-1) == 'x') {
            str = str.substring(0, str.length()-1);
        }
        return str;
    }

}
