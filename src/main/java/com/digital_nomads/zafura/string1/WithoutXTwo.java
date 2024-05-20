package com.digital_nomads.zafura.string1;

public class WithoutXTwo {
    public String withoutX2(String str) {
        if (str.length() >= 2 && str.charAt(0) == 'x' && str.charAt(1) == 'x') {
            // Если да, удаляем оба символа "x"
            return str.substring(2);
        }

        // Проверяем, что длина строки больше или равна 1 и первый символ "x"
        if (str.length() >= 1 && str.charAt(0) == 'x') {
            // Если да, удаляем только первый символ "x"
            return str.substring(1);
        }   if (str.length() > 0 && str.charAt(0) != 'x' && str.charAt(1) == 'x') {
            // Если первый символ не "x", а второй "x", удаляем его
            str = str.substring(0, 1) + str.substring(2);
        }

        // Возвращаем строку без изменений
        return str;
    }
}
