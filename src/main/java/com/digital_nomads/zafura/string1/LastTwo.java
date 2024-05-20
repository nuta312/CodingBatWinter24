package com.digital_nomads.zafura.string1;

public class LastTwo {
    public String lastTwo(String str) {
        if (str.length() < 2) {
            return str;}
        char secondLastChar = str.charAt(str.length() - 2);
        char lastChar = str.charAt(str.length() - 1);

        // Формируем новую строку, меняя местами последние два символа, если они присутствуют
        return str.substring(0, str.length() - 2) + lastChar + secondLastChar;


    }
}
