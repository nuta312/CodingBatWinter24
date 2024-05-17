package com.digital_nomads.nargiza.warmup1;

public class SleepIn {

    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation) {
            return true;
        } else {
            return false;
        }
    }
}
