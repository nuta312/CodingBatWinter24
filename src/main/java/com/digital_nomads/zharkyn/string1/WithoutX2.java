package com.digital_nomads.zharkyn.string1;

public class WithoutX2 {

    /* Учитывая строку, если один или оба первых двух символа равны «x», верните строку без этих символов «x»,
    а в противном случае верните строку без изменений. Это немного сложнее, чем кажется.*/

    public String withoutX2(String str) {
        if (str.length() <2) return "";
        if (str.charAt(1) == 'x') {
            str = str.substring(0,1) + str.substring(2);
        }
        if (str.charAt(0) == 'x') {
            str = str.substring(1);
        }
        return str;
    }
}
