package com.digital_nomads.aika.warmup1;

public class Diff21 {
    public int diff21(int n) {
        int diff = 0;
        if(n <=21){
            return 21-n;
        } else {
            return (n-21)*2;
        }
    }
}
