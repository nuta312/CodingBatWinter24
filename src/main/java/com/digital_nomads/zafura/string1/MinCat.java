package com.digital_nomads.zafura.string1;

public class MinCat {
    public String minCat(String a, String b) {
        int minLength = Math.min(a.length(), b.length());

        // Обрезаем строки до минимальной длины
        a = a.substring(a.length() - minLength);
        b = b.substring(b.length() - minLength);

        // Конкатенируем обрезанные строки
        return a + b;

    }
}
