package com.digital_nomads.zharkyn.string1;

public class ExtraFront {

    /*Учитывая строку, верните новую строку, состоящую из трех копий первых двух
    символов исходной строки. Строка может быть любой длины.
    Если меньше двух символов, используйте все, что есть.*/

    public String extraFront(String str) {
        return str.length() < 2 ? str + str + str :
                str.substring(0,2) + str.substring(0,2) + str.substring(0,2);
    }

}
