package com.digital_nomads.aika.warmup1;

public class Max1020 {
    public int max1020(int a, int b) {
        if (b > a) {
            int num = a;
            a = b;
            b = num;
        }
        if (a >= 10 && a <= 20) return a;
        if (b >= 10 && b <= 20) return b;
        return 0;
    }
}
