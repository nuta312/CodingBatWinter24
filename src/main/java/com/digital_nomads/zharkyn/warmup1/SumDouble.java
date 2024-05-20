package com.digital_nomads.zharkyn.warmup1;

/* Условия задачи:
Учитывая два целочисленных значения, верните их сумму. Если два значения не совпадают,
верните двойную их сумму.*/

public class SumDouble {
    public int sumDouble(int a, int b) {
        int sum = 0;
        if (a==b) {
            sum = 2*(a+b);
            return sum;
        } else sum = a+b;
        return sum;
    }
}
