package com.digital_nomads.aiba.string3;

public class SameEnds {
    public String sameEnds(String string) {
        int length = string.length();

        // Начинаем с самой длинной возможной подстроки
        for (int i = length / 2; i >= 0; i--) {
            String substr = string.substring(0, i);

            // Проверяем, содержится ли текущая подстрока и в начале, и в конце строки
            if (string.endsWith(substr)) {
                return substr;
            }
        }

        // Если не найдено подходящей подстроки, вернем пустую строку
        return "";
    }
}

