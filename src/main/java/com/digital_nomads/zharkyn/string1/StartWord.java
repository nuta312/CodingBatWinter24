package com.digital_nomads.zharkyn.string1;

public class StartWord {

// Учитывая строку и вторую строку «слово», мы будем говорить, что слово соответствует
// строке, если оно находится в начале строки, за исключением того, что его первый
// символ не обязательно должен точно совпадать. При совпадении верните начало строки
// или иным образом верните пустую строку. Итак, в строке «бегемот» слово «привет»
// возвращает «привет», а «xip» возвращает «бедро». Слово будет иметь длину не менее 1.

    public String startWord(String str, String word) {
        return str.length() < word.length() || str.length() == 0 ? "":
                str.substring(1, word.length()).equals(word.substring(1)) ? str.substring (0,word.length()):
                        "";
    }
}
