package com.digital_nomads.aika.warmup1;

public class SleepIn {
    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (weekday && !vacation) {
            return false;
        } else {
            return true;
        }
    }
}
