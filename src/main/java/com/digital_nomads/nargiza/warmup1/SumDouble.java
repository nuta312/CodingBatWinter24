package com.digital_nomads.nargiza.warmup1;

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
