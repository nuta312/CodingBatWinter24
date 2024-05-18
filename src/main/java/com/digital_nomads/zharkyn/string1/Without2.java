package com.digital_nomads.zharkyn.string1;

public class Without2 {

    /*Учитывая строку, если подстрока длиной 2 появляется как в ее начале, так и в конце,
    верните строку без подстроки в начале, поэтому «HelloHe» дает «lloHe».
    Подстрока может перекрываться сама с собой, поэтому "Hi" дает "".
    В противном случае верните исходную строку без изменений.*/

    public String without2(String str) {
        if (str.length() < 2) return str;

        if (str.substring(0, 2).equals(str.substring(str.length() - 2)))
            return str.substring(2);
        else return str;
    }
}
