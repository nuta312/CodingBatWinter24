package com.digital_nomads.zharkyn.string1;

/*Учитывая строку, верните версию без первых двух символов. За исключением сохранения
первого символа, если это «a», и сохранения второго символа, если это «b».
Строка может быть любой длины. Сложнее, чем кажется.*/

public class DeFront {
    public String deFront(String str) {
        return
          str.length() >=1 && str.charAt(0) == 'a' && str.charAt(1)!= 'b'  ? str.substring(0,1) + str.substring(2):
          str.length() >=2 && str.charAt(1)== 'b' && str.charAt(0) != 'a'? str.substring (1,2) + str.substring(2):
          str.length() >=2 && str.charAt(0) == 'a' && str.charAt(1)== 'b' ? str:
          str.substring(2);
    }



}
