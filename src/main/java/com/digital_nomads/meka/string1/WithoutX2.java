package com.digital_nomads.meka.string1;

public class WithoutX2 {

    public String withoutX2(String str) {
        // Проверяем, что строка содержит хотя бы один символ
        if (str.length() >= 1) {
            // Проверяем, если строка состоит только из символа 'x', возвращаем пустую строку
            if (str.length() == 1 && str.charAt(0) == 'x') {
                return "";
            }
            // Проверяем первые два символа
            if (str.charAt(0) == 'x' && str.charAt(1) == 'x') {
                // Если оба символа 'x', удаляем оба
                return str.substring(2);
            } else if (str.charAt(0) == 'x') {
                // Если первый символ 'x', удаляем его
                return str.substring(1);
            } else if (str.charAt(1) == 'x') {
                // Если второй символ 'x', удаляем его
                return str.charAt(0) + str.substring(2);
            }
        }
        // Возвращаем строку без изменений
        return str;
    }

}
