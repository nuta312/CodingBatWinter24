package com.digital_nomads.nargiza.string1;

public class AtFirst {

    public String atFirst(String str) {
        if (str.length() >= 2) {               //если длина больше 2
            return str.substring(0, 2);  //то вырежи индекса 0 по 2
        } else if (str.length() == 1) {  //если длина равна 1
            return str + "@";             //то распечатай букву и @
        } else {
            return "@@";                  // ИНАЧЕ @@
        }
    }

}
