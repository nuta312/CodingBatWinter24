package com.digital_nomads.aika.warmup1;

public class Close10 {
    public int close10(int a, int b) {
        int aa = Math.abs(10 - a);
        int bb = Math.abs(10 - b);
        if ( aa < bb) {
            return a;
        } if ( aa > bb) {
            return b;
        } else {
            return 0;
        }

    }
}
