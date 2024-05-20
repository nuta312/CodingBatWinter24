package com.digital_nomads.aika.warmup1;

public class IntMax {
    public int intMax(int a, int b, int c) {
        int max;
        if(a > b){
            max = a;
        }  else {
            max = b;
        }
        if (c > max) {
            return max = c;
        }
        return max;
    }
}
