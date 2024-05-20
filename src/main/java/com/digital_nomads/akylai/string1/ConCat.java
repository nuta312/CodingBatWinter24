package com.digital_nomads.akylai.string1;

public class ConCat {

    public String conCat(String a, String b) {
        if (a == null && b == null) {
            return "";
        }
        if (a == null) {
            return b;
        }
        if (b == null) {
            return a;
        }
        if (b.isEmpty()) {
            return a;
        }
        // Проверяем, заканчивается ли str1 на первый символ str2
        return a.endsWith("" + b.charAt(0)) ?
                a + b.substring(1) : a + b;

    }


}
