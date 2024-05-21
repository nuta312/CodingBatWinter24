package com.digital_nomads.nargiza.string1;

public class NTwice {

    public String nTwice(String str, int n) {
        if (str.length() >= n){                   //Проверяем, что длина строки больше или равна n
            String str1 = str.substring(0, n);              // Взять первые n символов
            String str2 = str.substring(str.length() - n);  // Взять последние n символов
            return str1 + str2;
        } else {
            return "";
        }
    }
}
