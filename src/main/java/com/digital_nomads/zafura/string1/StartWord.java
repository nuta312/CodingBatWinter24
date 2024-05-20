package com.digital_nomads.zafura.string1;

public class StartWord {
    public String startWord(String str, String word) {
        if (str.length() >= word.length()) {
            // Получаем подстроку из строки, равную длине слова
            String substr = str.substring(0, word.length());

            // Проверяем, совпадает ли подстрока со словом, игнорируя первый символ
            if (substr.substring(1).equals(word.substring(1))) {
                return substr;
            }
        }

        return "";

    }

}
